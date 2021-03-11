package com.github.sidneymiranda.citiesapi.services;

import com.github.sidneymiranda.citiesapi.entities.City;
import com.github.sidneymiranda.citiesapi.repository.CityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.geo.Point;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class DistanceService {

    private final CityRepository cityRepository;
    Logger log = LoggerFactory.getLogger(DistanceService.class);

    public DistanceService(final CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public ResponseEntity distanceByPointsInMiles(final Long city1, final Long city2) {
        log.info("nativePostgresInMiles({}, {})", city1, city2);
        Optional<Double> optional = Optional.ofNullable((Double) cityRepository.distanceByPoints(city1, city2));
         if(optional.isPresent()){
             return ResponseEntity.ok().body(optional.get());
         }
         return  ResponseEntity.notFound().build();
    }

    public ResponseEntity distanceByCubeInMeters(Long city1, Long city2) {
        log.info("distanceByCubeInMeters({}, {})", city1, city2);

        final List<City> cities = cityRepository.findAllById((Arrays.asList(city1, city2)));

        if(!cities.isEmpty()){
            Point p1 = cities.get(0).getLocation();
            Point p2 = cities.get(1).getLocation();
            Double distance = cityRepository.distanceByCube(p1.getX(), p1.getY(), p2.getX(), p2.getY());

            return ResponseEntity.ok().body(distance);
        }
        return ResponseEntity.notFound().build();
    }
}
