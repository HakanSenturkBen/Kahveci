import java.sql.Date;

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager yeni=new StarbuckCustomerManager();
		BaseCustomerManager yeni1= new NeroCustomerManager();
		yeni.save(new Customer(1, "hakan", "�ent�rk",Date.valueOf("2002-12-28"), "12345678910"));
		
		yeni1.save(new Customer(1, "veysel", "�ent�rk",Date.valueOf("2001-12-28"), "12345678910"));
		

	}

}
