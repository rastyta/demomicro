package com.knowledgecafe.demomicro.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@Configuration
@EnableCouchbaseRepositories(basePackages = {"com.knowledgecafe.demomicro.model"})
public class CouchbaseConf extends AbstractCouchbaseConfiguration {

    @Override
    public String getConnectionString() {
        return "couchbase://44.203.207.16";
    }

    @Override
    public String getUserName() {
        return "admin";
    }

    @Override
    public String getPassword() {
        return "Rastyta007!";
    }

    @Override
    public String getBucketName() {
        return "Customer";
    }
}
