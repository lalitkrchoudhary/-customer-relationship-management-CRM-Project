package in.lalit.dao;

import org.springframework.data.repository.CrudRepository;

import in.lalit.model.Customer;

public interface ICustomerDAO extends CrudRepository<Customer, Integer> {

}
