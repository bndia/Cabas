package com.bendiamand.cabas.controller;

import com.bendiamand.cabas.entity.Area;
import com.bendiamand.cabas.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AreaRestController {

    @Autowired
    private AreaService areaService;


    // == REST API ==
    @GetMapping("/areas")
    public List<Area> getAllAreas() {
        List<Area> areas = areaService.findAll();
        System.out.println(areas);
        return areas;
    }

    @GetMapping("/areas/{areaId}")
    public Area getArea(@PathVariable int areaId) {
        Area area = areaService.findById(areaId);
        return area;
    }

    @PostMapping("/areas")
    public Area addArea(@RequestBody Area area) {
        areaService.save(area);
        return area;
    }

    @PutMapping("/areas")
    public Area updateArea(@RequestBody Area area) {
        areaService.save(area);
        return area;
    }

    @DeleteMapping("/areas/{areaId}")
    public String deleteArea(@PathVariable int areaId) {
        areaService.deleteById(areaId);
        return "Successfully deleted area id: " + areaId;
    }
}
