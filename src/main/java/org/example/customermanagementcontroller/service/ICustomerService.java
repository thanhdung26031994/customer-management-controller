package org.example.customermanagementcontroller.service;

import org.example.customermanagementcontroller.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    Customer findById(Integer id);

    void save(Customer customer);
}
