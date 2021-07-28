/**
 * 
 */
package sd.wahbi.ejar.service;

import java.time.LocalDate;

import javax.persistence.EntityNotFoundException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sd.wahbi.ejar.constant.BookingStatus;
import sd.wahbi.ejar.dao.Apartment;
import sd.wahbi.ejar.dao.Booking;
import sd.wahbi.ejar.dto.BookingDto;
import sd.wahbi.ejar.exception.OccupiedApartmentException;
import sd.wahbi.ejar.repository.ApartmentRepository;
import sd.wahbi.ejar.repository.BookingRepository;

/**
 * @author ahmedozy
 *
 */
@Service
public class BookingService implements IBookingService {

	@Autowired
	private ModelMapper mapper;
	@Autowired
	private ApartmentRepository apartmentRepo;
	
	@Autowired
	private BookingRepository bookingRepo;
	
	@Override
	public BookingDto requestBooking(BookingDto bookingDto) {
		int occupiedApartmentsCount;
		Apartment apartment;
		Booking booking;
		try {
			apartment = apartmentRepo.getOne(bookingDto.getApparmentId());
			occupiedApartmentsCount = bookingRepo.countByApartmentAndStatus(apartment,BookingStatus.FREE);
			if(occupiedApartmentsCount > 0) {
				throw new OccupiedApartmentException();
			}
			booking = mapper.map(bookingDto, Booking.class);
			booking.setStatus(BookingStatus.BOOKED);
			booking.setApartment(apartment);
			bookingRepo.save(booking);
		} catch(OccupiedApartmentException e) {
			// TODO: The apartment is not available
		}catch(EntityNotFoundException e) {
			// TODO: no such apartment id
		} catch(IllegalArgumentException e) {
			// TODO: couldn't save booking
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public BookingDto confirmBooking(BookingDto bookingDto) {
		Booking booking;
		try {
			booking = bookingRepo.getOne(bookingDto.getId());
			if(booking.getStatus() == BookingStatus.BOOKED) {
				booking.setStatus(BookingStatus.CONFIRMED);
				booking.setLastModified(LocalDate.now());
				bookingRepo.save(booking);
			}
		} catch( EntityNotFoundException e) {
			// TODO: handle no booking
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public BookingDto deleteBooking(BookingDto bookingDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookingDto expireBooking(BookingDto bookingDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
