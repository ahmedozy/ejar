package sd.wahbi.ejar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sd.wahbi.ejar.constant.BookingStatus;
import sd.wahbi.ejar.dao.Apartment;
import sd.wahbi.ejar.dao.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

	public int countByApartmentAndStatus(Apartment apartment, BookingStatus status);
}
