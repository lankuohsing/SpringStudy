package com.languoxing.spring_sample;

import com.languoxing.spring_sample.service.CustomerService;
import com.languoxing.spring_sample.service.CustomerServiceImp;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        CustomerService service = new CustomerServiceImp();
        System.out.println("FirstName: " + service.findAll().get(0).getFirstName());
        System.out.println("LastName: " + service.findAll().get(0).getLastName());

    }
}
