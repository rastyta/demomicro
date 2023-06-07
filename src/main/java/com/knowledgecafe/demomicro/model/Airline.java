package com.knowledgecafe.demomicro.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;

import javax.validation.constraints.NotNull;

import static org.springframework.data.couchbase.core.mapping.id.GenerationStrategy.UNIQUE;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Document
public class Airline {
    @GeneratedValue(strategy = UNIQUE)
    @JsonIgnore
    @Id
    private String id;
    @NotNull
    @Field
    private String name;
    @NotNull
    @Field
    private String type;
    @NotNull
    @Field
    private String callsign;
    @NotNull
    @Field
    private String country;
    @NotNull
    @Field
    private String iata;
    @NotNull
    @Field
    private String icao;

}
