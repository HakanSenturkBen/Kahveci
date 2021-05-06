import java.sql.Date;
import java.util.Calendar;

public class Customer implements Entity {
	private int id;
	private String firstName;
	private String lastName;
	private String bornedYear;
	private String NationalityId;
	
	public Customer() {
	}
	public Customer(int id, String firstName, String lastName, String bornedYear, String nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.bornedYear = bornedYear;
		NationalityId = nationalityId;
	}
	
	public String getBornedYear() {
		return bornedYear;
	}
	public void setBornedYear(String bornedYear) {
		this.bornedYear = bornedYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	
	

}
