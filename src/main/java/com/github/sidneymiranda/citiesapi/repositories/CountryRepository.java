package com.github.sidneymiranda.citiesapi.repositories;

import com.github.sidneymiranda.citiesapi.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}
