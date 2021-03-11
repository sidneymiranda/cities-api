package com.github.sidneymiranda.citiesapi.services;

import com.github.sidneymiranda.citiesapi.entities.City;
import com.github.sidneymiranda.citiesapi.repository.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor_ = {@Autowired})
public class CityService {

    private final CityRepository repository;

    public Page<City> findAll(Pageable pageable){
        return repository.findAll(pageable);
    }

    public ResponseEntity<City> getOne(Long id){
        Optional<City> optional = repository.findById(id);
        if(optional.isPresent()){
            return ResponseEntity.ok().body(optional.get());
        }
        return  ResponseEntity.notFound().build();
    }
}
