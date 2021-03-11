package com.github.sidneymiranda.citiesapi.repository;

import com.github.sidneymiranda.citiesapi.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
