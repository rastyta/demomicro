package com.knowledgecafe.demomicro.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;

import javax.validation.constraints.NotNull;

import static org.springframework.data.couchbase.core.mapping.id.GenerationStrategy.UNIQUE;


@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Customer {
        @GeneratedValue(strategy = UNIQUE)
        @JsonIgnore
        @Id
        private String id;
        @NotNull
        @Field
        private String firstName;
        @NotNull
        @Field
        private String lastName;
        @Field
        private String email;
}
