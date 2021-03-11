package com.github.sidneymiranda.citiesapi.services;


import com.github.sidneymiranda.citiesapi.entities.Country;
import com.github.sidneymiranda.citiesapi.repositories.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor_ = {@Autowired})
public class CountryService {

    private final CountryRepository repository;

    public Page<Country> findAll(Pageable pageable){
        return repository.findAll(pageable);
    }

    public ResponseEntity<Object> getOne(Long id){
        Optional<Country> optional = repository.findById(id);
        if(optional.isPresent()){
            return ResponseEntity.ok().body(optional.get());
        }
        return  ResponseEntity.notFound().build();
    }
}
