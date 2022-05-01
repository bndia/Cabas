package com.bendiamand.cabas.service;

import com.bendiamand.cabas.entity.Area;
import com.bendiamand.cabas.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaService {

    // == Fields ==
    @Autowired
    private AreaRepository areaRepository;

    // == Constructors ==
    public AreaService() {
    }

    // == Methods ==
    public List<Area> findAll() {
        return areaRepository.findAll();
    }

    public Area findById(int id) {
        return areaRepository.findById(id).orElseThrow(() -> new RuntimeException("Did not find area id - " + id));
    }

    public void save(Area area) {
        areaRepository.save(area);
    }

    public void deleteById(int id) {
        areaRepository.deleteById(id);
    }

}
