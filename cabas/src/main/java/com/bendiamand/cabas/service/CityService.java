package com.bendiamand.cabas.service;

import com.bendiamand.cabas.entity.City;
import com.bendiamand.cabas.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    // == Fields ==
    @Autowired
    private CityRepository cityRepository;

    // == Constructors ==
    public CityService() {
    }

    // == Methods ==
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    public City findById(int id) {
        return cityRepository.findById(id).orElseThrow(() -> new RuntimeException("Did not find city id - " + id));
    }

    public void save(City city) {
        cityRepository.save(city);
    }

    public void deleteById(int id) {
        cityRepository.deleteById(id);
    }
}
