package my.vaadin.university;

import java.util.Date;

public class Student {

	public Student() {
	}
    
    public Student(Long id, String lastname, String firstname, String patronymic, Date birthday, int group) {
    	this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.group = group;
    }
	
	private Long id;	
	private String lastname = "";
	private String firstname = "";
	private String patronymic = "";
	private Date birthday;
	private int group;
	
	public Long getid() {
		return id;
	}
	public void setid(Long id) {
		this.id = id;
	}
	
	public String getfirstname() {
		return firstname;
	}
	
	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getlastname() {
		return lastname;
	}
	
	public void setlastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getpatronymic() {
		return patronymic;
	}
	
	public void setpatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	
	public Date getbirthday() {
		return birthday;
	}
	
	public void setbirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public int getgroup() {
		return group;
	}
	public void setgroup(int group) {
		this.group = group;
	}

}
