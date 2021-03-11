package com.github.sidneymiranda.citiesapi.repository;

import com.github.sidneymiranda.citiesapi.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
