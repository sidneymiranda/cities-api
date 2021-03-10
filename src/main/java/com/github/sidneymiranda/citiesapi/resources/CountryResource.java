package com.github.sidneymiranda.citiesapi.resources;

import com.github.sidneymiranda.citiesapi.entities.Country;
import com.github.sidneymiranda.citiesapi.services.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/countries")
@AllArgsConstructor(onConstructor_ = {@Autowired})
public class CountryResource {

    private final CountryService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Page<Country> countryList(Pageable pageable){
        return service.findAll(pageable);
    }
}
