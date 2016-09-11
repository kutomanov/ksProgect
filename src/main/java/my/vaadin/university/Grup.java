package my.vaadin.university;

public class Grup {

	private Long id;
	private int grupnumber;
	private String department = "";	
	
	public Long id() {
		return id;
	}
	public void setid(Long id) {
		this.id = id;
	}
	
	public int grupnumber() {
		return grupnumber;
	}
	public void setgrupnumber(int grupnumber) {
		this.grupnumber = grupnumber;
	}
	
	public String department() {
		return department;
	}
	
	public void setdepartment(String department) {
		this.department = department;
	}
}
