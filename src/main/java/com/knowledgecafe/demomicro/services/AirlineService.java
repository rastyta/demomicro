package com.knowledgecafe.demomicro.services;

import com.knowledgecafe.demomicro.model.Airline;
import com.knowledgecafe.demomicro.repositories.AirlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AirlineService {

    @Autowired
    private AirlineRepository airlineRepository;

    public List<Airline> getAirlinesByName(String name) {
        return airlineRepository.findByName(name);
    }

    public List listAirlines() {
        Iterable airlineIterable = airlineRepository.findAll();
        List airlines = new ArrayList();
        airlineIterable.forEach(airlines::add);
//        Airline test =(Airline) airlines.get(0);
//        System.out.println("************************ "+test.getName());
        return airlines;
    }

    public Airline saveAirline(Airline airline){
        return airlineRepository.save(airline);
    }

    public Optional<Airline> getAirlineById(String id) {
        if (airlineRepository.existsById(id)) {
            return airlineRepository.findById(id);
        } else
            return Optional.empty();
    }

    public void deleteAirlineById(String id) {
        airlineRepository.deleteById(id);
    }
}

