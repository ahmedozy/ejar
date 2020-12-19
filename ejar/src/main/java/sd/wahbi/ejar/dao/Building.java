/**
 * 
 */
package sd.wahbi.ejar.dao;

/**
 * @author ahmedozy
 *
 */
public class Building {

	private Integer id;
	private String name;
	private Integer numberOfApartments;
	private Location location;
	private String area;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumberOfApartments() {
		return numberOfApartments;
	}
	public void setNumberOfApartments(Integer numberOfAppartments) {
		this.numberOfApartments = numberOfAppartments;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Building [id=" + id + ", name=" + name + ", numberOfApartments=" + numberOfApartments + ", location="
				+ location + ", area=" + area + "]";
	}
	
	
}
