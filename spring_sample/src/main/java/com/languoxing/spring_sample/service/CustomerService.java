package com.languoxing.spring_sample.service;

import java.util.List;

import com.languoxing.spring_sample.model.Customer;

public interface CustomerService {

    List<Customer> findAll();

}