
public class StarbuckCustomerManager extends BaseCustomerManager{

	@Override
	public void save(Customer customer) {
		if (Utilyties.checkIfRealPerson(customer)) {
			System.out.println("starbuck müþterisi =:) "+customer.getFirstName()+" "+customer.getLastName());
			super.save(customer);	
		}else {
			System.out.println("bizimle deðilsiniz sayýn ~): "+customer.getLastName());
		}
		
	}

		
}
