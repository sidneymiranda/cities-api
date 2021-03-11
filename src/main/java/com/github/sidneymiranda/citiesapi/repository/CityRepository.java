package com.github.sidneymiranda.citiesapi.repository;

import com.github.sidneymiranda.citiesapi.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
