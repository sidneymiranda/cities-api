package com.github.sidneymiranda.citiesapi.resources;

import com.github.sidneymiranda.citiesapi.entities.State;
import com.github.sidneymiranda.citiesapi.services.StateService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/states")
@AllArgsConstructor(onConstructor_ = {@Autowired})
public class StateResource {

    private final StateService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<State> countryList(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<State> getCountryById(@PathVariable Long id) {
        return service.getOne(id);
    }
}
