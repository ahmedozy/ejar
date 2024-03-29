/**
 * 
 */
package sd.wahbi.ejar.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import sd.wahbi.ejar.constant.BookingStatus;

/**
 * @author ahmedozy
 *
 */
@Getter
@Setter
public class BookingDto {

	private Long id;
	private Long apparmentId;
	private LocalDate date;
	private Long durationInDays;
	private Double paidAmount;
	private Double totalAmount;
	private BookingStatus status;
}
