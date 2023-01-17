package com.knowledgecafe.demomicro.services;

import com.knowledgecafe.demomicro.model.Customer;
import com.knowledgecafe.demomicro.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List listCustomers() {
        Iterable customerIterable = customerRepository.findAll();
        List customers = new ArrayList();
        customerIterable.forEach(customers::add);
        Customer test =(Customer) customers.get(0);
        System.out.println("************************ "+test.getId());
        return customers;
    }

    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public Optional<Customer> getCustomerById(String id) {
        if (customerRepository.existsById(id)) {
            return customerRepository.findById(id);
        } else
            return Optional.empty();
    }

    public void deleteCustomerById(String id) {
        customerRepository.deleteById(id);
    }
}
