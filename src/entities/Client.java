package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String name;
	private String email;
	private Date birthDate;
	
	public Client() {
	}

	public Client(String name, String email, Date birtDate) {
		super();
		this.name = name;
		this.email = email;
		this.birthDate = birtDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirtDate() {
		return birthDate;
	}

	public void setBirtDate(Date birtDate) {
		this.birthDate = birtDate;
	}
	
	public String toString() {
		return name + " (" + sdf.format(birthDate) + ") - " + email;
	}
}
