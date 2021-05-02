package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	CustomerCheckService customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		
		if(customerCheckService.CheckPerson(customer)) {
			System.out.println("Starbucks Customer : Registration successful.");
			super.save(customer);
		}else
			System.out.println("Registration is failed - not a valid person");
		
	}

	
}
