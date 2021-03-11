package com.github.sidneymiranda.citiesapi.services;

import com.github.sidneymiranda.citiesapi.entities.State;
import com.github.sidneymiranda.citiesapi.repository.StateRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor_ = {@Autowired})
public class StateService {

    private final StateRepository repository;

    public List<State> findAll(){
        return repository.findAll();
    }

    public ResponseEntity<State> getOne(Long id){
        Optional<State> optional = repository.findById(id);
        return optional.map(state -> ResponseEntity.ok().body(state)).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
