
public class NeroCustomerManager extends BaseCustomerManager{

	@Override
	public void save(Customer customer) {
		System.out.println("nero m��terisi =:) "+customer.getFirstName()+" "+customer.getLastName());
		super.save(customer);
	}

	

	
	
}
