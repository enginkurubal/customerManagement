package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	CustomerCheckService customerCheckService;

	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckPerson(customer)) {
			System.out.println("Nero Customer : Registration successful.");
			super.save(customer);
		}else {
			System.out.println("Registration is failed - not a valid person");
		}
	}
	
	
	
	
	
	
	
	
	public NeroCustomerManager(CustomerCheckManager customerCheckManager) {
		
	}
	

}
