package com.languoxing.spring_sample.repository;

import java.util.ArrayList;
import java.util.List;

import com.languoxing.spring_sample.model.Customer;

public class CustomerRepositoryImp implements CustomerRepository {

    /*
     * (non-Javadoc)
     *
     * @see com.languoxing.spring_sample.repository.CustomerRepository#findAll()
     */
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<Customer>();
        Customer customer = new Customer();
        customer.setFirstName("Guoxing");
        customer.setLastName("Lan");
        customers.add(customer);
        return customers;
    }
}
