
public class StarbuckCustomerManager extends BaseCustomerManager{

	@Override
	public void save(Customer customer) {
		if (Utilyties.checkIfRealPerson(customer)) {
			System.out.println("starbuck m��terisi =:) "+customer.getFirstName()+" "+customer.getLastName());
			super.save(customer);	
		}else {
			System.out.println("bizimle de�ilsiniz say�n ~): "+customer.getLastName());
		}
		
	}

		
}
