package com.languoxing.spring_sample.service;

import java.util.List;

import com.languoxing.spring_sample.model.Customer;
import com.languoxing.spring_sample.repository.CustomerRepositoryImp;

public class CustomerServiceImp implements CustomerService {
    private CustomerRepositoryImp customerRepository = new CustomerRepositoryImp();

    /* (non-Javadoc)
     * @see com.languoxing.spring_sample.service.CustomerService#findAll()
     */
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
