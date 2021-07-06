/**
 * 
 */
package sd.wahbi.ejar.service;

import sd.wahbi.ejar.dto.BookingDto;

/**
 * @author ahmedozy
 *
 */
public interface IBookingService {

	public BookingDto requestBooking(BookingDto bookingDto);
	public BookingDto confirmBooking(BookingDto bookingDto);
	public BookingDto deleteBooking(BookingDto bookingDto);
	public BookingDto expireBooking(BookingDto bookingDto);
	
}
