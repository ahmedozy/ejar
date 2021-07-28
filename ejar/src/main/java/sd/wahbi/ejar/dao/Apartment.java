/**
 * 
 */
package sd.wahbi.ejar.dao;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import sd.wahbi.ejar.constant.BookingStatus;

/**
 * @author ahmedozy
 *
 */
@Getter
@Setter
@ToString
@Builder
public class Apartment {

	private Long id;
	private Integer index;
	private String name;
	private Building parent;

}
