import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Utilyties {
	@SuppressWarnings("deprecation")
	static boolean checkIfRealPerson(Customer customer) {
	
		   KPSPublicSoapProxy dogrula= new KPSPublicSoapProxy();
		   
	        long tcno=Long.parseLong(customer.getNationalityId());
	        String firstName=customer.getFirstName().toUpperCase();
	        String surName=customer.getLastName().toUpperCase();
	        int year=Integer.parseInt(customer.getBornedYear());
	        
	        try {
				return  dogrula.TCKimlikNoDogrula(tcno,firstName,surName,year);
				
			} catch (RemoteException e) {
				
				return false;
			}
	    
	}
	

}
