/**
 * 
 */
package sd.wahbi.ejar.dao;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import sd.wahbi.ejar.constant.BookingStatus;

/**
 * @author ahmedozy
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Booking {

	private Long id;
	private Apartment apartment;
	private LocalDate bookingDate;
	private LocalDate lastModified;
	private Long durationInDays;
	private Double paidAmount;
	private Double totalAmount;
	private BookingStatus status;
}
