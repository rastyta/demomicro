package com.knowledgecafe.demomicro.repositories;

import com.knowledgecafe.demomicro.model.Customer;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

public interface CustomerRepository extends CouchbaseRepository<Customer, String> {
}
