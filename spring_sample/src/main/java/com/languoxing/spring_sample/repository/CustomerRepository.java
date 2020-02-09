package com.languoxing.spring_sample.repository;

import java.util.List;

import com.languoxing.spring_sample.model.Customer;

public interface CustomerRepository {

    List<Customer> findAll();

}