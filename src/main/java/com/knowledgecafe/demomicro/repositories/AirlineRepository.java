package com.knowledgecafe.demomicro.repositories;

import com.knowledgecafe.demomicro.model.Airline;
import org.springframework.context.annotation.Scope;
import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Scope("inventory")
public interface AirlineRepository extends CouchbaseRepository<Airline, String> {
    List<Airline> findByName(String name);

    List<Airline> findAll();
}

