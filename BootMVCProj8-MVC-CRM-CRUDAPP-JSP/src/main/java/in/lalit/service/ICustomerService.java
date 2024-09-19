package in.lalit.service;

import java.util.List;

import in.lalit.model.Customer;

public interface ICustomerService {
	public List<Customer> getCustomers();
	public void saveCustomer(Customer customer);
	public Customer getCustomer(Integer customerId);
	public void deleteCustomer(Integer customerId);
}
