package com.bendiamand.cabas.controller;

import com.bendiamand.cabas.entity.City;
import com.bendiamand.cabas.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CityRestController {

    @Autowired
    private CityService cityService;

    // == REST API ==
    @GetMapping("/cities")
    public List<City> getAllCities() {
        List<City> cities = cityService.findAll();
        return cities;
    }

    @GetMapping("/cities/{cityId}")
    public City getCity(@PathVariable int cityId) {
        City city = cityService.findById(cityId);
        return city;
    }

    @PostMapping("/cities")
    public City addCity(@RequestBody City city){
        cityService.save(city);
        return city;
    }

    @PutMapping("/cities")
    public City updateCity(@RequestBody City city){
        cityService.save(city);
        return city;
    }

    @DeleteMapping("/cities/{cityId}")
    public String deleteCity(@PathVariable int cityId){
        cityService.deleteById(cityId);
        return "Successfully deleted city id: " + cityId;
    }
}
