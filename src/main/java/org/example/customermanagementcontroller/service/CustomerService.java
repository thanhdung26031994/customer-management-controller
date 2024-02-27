package org.example.customermanagementcontroller.service;

import org.example.customermanagementcontroller.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService{
    private static final List<Customer> customerList = new ArrayList<>();
    static {
        customerList.add(new Customer(1, "Nguyen Khac Nhat", "nhat@codegym.vn", "Hà Nội"));
        customerList.add(new Customer(2, "Dang Huy Hoa", "hoa.dang@codegym.vn", "Đà Nẵng"));
        customerList.add(new Customer(3, "Nguyen Thuy Duong", "duong.nguyen@codegym.vn", "Sài Gòn"));
    }
    @Override
    public List<Customer> findAll() {
        return customerList;
    }

    @Override
    public Customer findById(Integer id) {
        for (Customer customer: customerList){
            if (customer.getId().equals(id)){
                return customer;
            }
        }
        return null;
    }

    @Override
    public void save(Customer customer) {
        Customer c = findById(customer.getId());
        c.setName(customer.getName());
        c.setEmail(customer.getEmail());
        c.setAddress(customer.getAddress());
    }
}
