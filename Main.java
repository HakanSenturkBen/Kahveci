

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager yeni=new StarbuckCustomerManager();
		BaseCustomerManager yeni1= new NeroCustomerManager();
		yeni.save(new Customer(1, "hakan", "�ent�rk","1971", "xxxxxxxxxxxxxx"));
		
		yeni1.save(new Customer(1, "veysel", "�ent�rk","2001-12-28", "12345678910"));
		

	}

}
