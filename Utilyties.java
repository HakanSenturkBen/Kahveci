import java.sql.Date;

public class Utilyties {
	
	static boolean checkIfRealPerson(Customer customer) {
		
		return customer.getNationalityId().length()==11 && customer.getDateOfBirth().before(Date.valueOf("2003-03-15"));
	}
	

}
