package com.knowledgecafe.demomicro.controllers;

import com.knowledgecafe.demomicro.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    private List<Customer> customers = createList();

    @RequestMapping(value = "/customers", method = RequestMethod.GET, produces = "application/json")
    public List<Customer> firstPage() {
        return customers;
    }

    @DeleteMapping(path = { "/{id}" })
    public Customer delete(@PathVariable("id") int id) {
        Customer deletedCustomer = null;
        for (Customer cus : customers) {
            if (cus.getId().equals(id)) {
                customers.remove(cus);
                deletedCustomer = cus;
                break;
            }
        }
        return deletedCustomer;
    }

    @PostMapping
    public Customer create(@RequestBody Customer cus) {
        customers.add(cus);
        System.out.println(customers);
        return cus;
    }

    private static List<Customer> createList() {
        List<Customer> tempCustomers = new ArrayList<>();
        Customer cus1 = new Customer();
        cus1.setFirstName("rasty3");
        cus1.setLastName("manager");
        cus1.setId("1");

        Customer cus2 = new Customer();
        cus2.setFirstName("Selva3");
        cus2.setLastName("manager2");
        cus2.setId("2");
        tempCustomers.add(cus1);
        tempCustomers.add(cus2);
        return tempCustomers;
    }
}
