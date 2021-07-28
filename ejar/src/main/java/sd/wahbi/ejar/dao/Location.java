/**
 * 
 */
package sd.wahbi.ejar.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author ahmedozy
 *
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
public class Location {

	private double longitude;
	private double latitude;
}
