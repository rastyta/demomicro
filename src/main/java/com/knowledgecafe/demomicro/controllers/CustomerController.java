package com.knowledgecafe.demomicro.controllers;

import com.knowledgecafe.demomicro.model.Customer;
import com.knowledgecafe.demomicro.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/customers", method = RequestMethod.GET, produces = "application/json")
    public List<Customer> getCustomers() {
        return customerService.listCustomers();
    }

    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/customers/{id}")
    public Optional<Customer> getCustomer(@PathVariable String id) {
        return customerService.getCustomerById(id);
    }

    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@PathVariable String id) {
        customerService.deleteCustomerById(id);
    }

}
