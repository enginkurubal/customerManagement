package customerManagement;

import java.util.Date;

import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		customer1.setDateOfBirth(new Date(1998,5,4));
		customer1.setFirstName("Engin Can");
		customer1.setLastName("Kurubal");
		customer1.setNationalityIdentityNumber("12345678910");
		
		Customer customer2 = new Customer();
		customer2.setDateOfBirth(new Date(1997,6,5));
		customer2.setFirstName("Engin");
		customer2.setLastName("Demiroð");
		customer2.setNationalityIdentityNumber("12345678980");
		
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new CustomerCheckManager());
		neroCustomerManager.save(customer1);
		
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		neroCustomerManager.save(customer2);
		
		
	}

}
