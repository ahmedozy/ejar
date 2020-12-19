/**
 * 
 */
package sd.wahbi.ejar.dao;

/**
 * @author ahmedozy
 *
 */
public class Apartment {

	private Integer id;
	private Integer index;
	private String name;
	private Building parent;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Building getParent() {
		return parent;
	}
	public void setParent(Building parent) {
		this.parent = parent;
	}
	@Override
	public String toString() {
		return "Apartment [id=" + id + ", index=" + index + ", name=" + name + ", parent=" + parent + "]";
	}
	
	
}
