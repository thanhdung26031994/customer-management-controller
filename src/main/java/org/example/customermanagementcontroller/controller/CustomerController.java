package org.example.customermanagementcontroller.controller;

import org.example.customermanagementcontroller.model.Customer;
import org.example.customermanagementcontroller.service.CustomerService;
import org.example.customermanagementcontroller.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @GetMapping
    public ModelAndView showList(){
        ModelAndView modelAndView = new ModelAndView("list");
        List<Customer> customerList = customerService.findAll();
        modelAndView.addObject("customer", customerList);
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView showInformation(@PathVariable Integer id){
        ModelAndView modelAndView = new ModelAndView("info");
        Customer customer = customerService.findById(id);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @PostMapping
    public String updateCustomer(Customer customer){
        customerService.save(customer);
        return "redirect:/customer";
    }
}
