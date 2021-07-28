/**
 * 
 */
package sd.wahbi.ejar.dao;

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
@ToString
@Builder
public class Building {

	private Long id;
	private String name;
	private Integer numberOfApartments;
	private Location location;
	private String area;}
