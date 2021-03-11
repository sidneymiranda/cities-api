package com.github.sidneymiranda.citiesapi.resources;

import com.github.sidneymiranda.citiesapi.entities.City;
import com.github.sidneymiranda.citiesapi.services.CityService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/cities")
@AllArgsConstructor(onConstructor_ = {@Autowired})
public class CityResource {

    private final CityService service;

  /* 1st
  @GetMapping
  public List<City> cities() {
      return repository.findAll();
  }*/

    // 2nd - Pageable
    @GetMapping
    public Page<City> cityList(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<City> getCityById(@PathVariable Long id) {
        return service.getOne(id);
    }
}
