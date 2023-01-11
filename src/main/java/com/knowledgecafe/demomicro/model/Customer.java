package com.knowledgecafe.demomicro.model;

import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import java.util.Objects;

@Generated
@Getter
@Setter
@NoArgsConstructor

@Document
public class Customer {
        @Id
        private String id;
        private String firstName;
        private String lastName;
        private String email;

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Customer customer = (Customer) o;
                return Objects.equals(id, customer.id) && Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(email, customer.email);
        }

        @Override
        public int hashCode() {
                return Objects.hash(id, firstName, lastName, email);
        }
}
