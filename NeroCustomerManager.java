
public class NeroCustomerManager extends BaseCustomerManager{

	@Override
	public void save(Customer customer) {
		System.out.println("nero müþterisi =:) "+customer.getFirstName()+" "+customer.getLastName());
		super.save(customer);
	}

	

	
	
}
