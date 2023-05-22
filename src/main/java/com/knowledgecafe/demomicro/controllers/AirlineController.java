package com.knowledgecafe.demomicro.controllers;

import com.knowledgecafe.demomicro.model.Airline;
import com.knowledgecafe.demomicro.services.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AirlineController {
    @Autowired
    AirlineService airlineService;

    @RequestMapping(value = "/airlines", method = RequestMethod.GET, produces = "application/json")
    public List<Airline> getAirlineByName() {
        return airlineService.listAirlines();
    }

    @RequestMapping(value = "/airline/{name}", method = RequestMethod.GET, produces = "application/json")
    public List<Airline> getAirlineByName(@PathVariable String name) {

        return airlineService.getAirlinesByName(name);
    }

    @PostMapping("/airline")
    public Airline addAirline(@RequestBody Airline airline) {
        return airlineService.saveAirline(airline);
    }

    @GetMapping("/airlines/{id}")
    public Optional<Airline> getCustomer(@PathVariable String id) {
        return airlineService.getAirlineById(id);
    }

    @DeleteMapping("/airlines/{id}")
    public void deleteCustomer(@PathVariable String id) {
        airlineService.deleteAirlineById(id);
    }
}
