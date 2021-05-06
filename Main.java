

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager yeni=new StarbuckCustomerManager();
		BaseCustomerManager yeni1= new NeroCustomerManager();
		yeni.save(new Customer(1, "hakan", "þentürk","1971", "xxxxxxxxxxxxxx"));
		
		yeni1.save(new Customer(1, "veysel", "þentürk","2001-12-28", "12345678910"));
		

	}

}
