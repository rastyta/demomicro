package com.knowledgecafe.demomicro.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@Configuration
@EnableCouchbaseRepositories(basePackages = {"com.knowledgecafe.demomicro.model"})
public class CouchbaseConf extends AbstractCouchbaseConfiguration {

    @Value("${db.couchbase.username}")
    private String username;
    @Value("${db.couchbase.password}")
    private String password;

    @Override
    public String getConnectionString() {
        return "couchbase://10.0.1.234";
    }

    @Override
    public String getUserName() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getBucketName() {
        return "travel-sample";
    }

}
