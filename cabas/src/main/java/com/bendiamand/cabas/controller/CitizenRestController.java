package com.bendiamand.cabas.controller;

import com.bendiamand.cabas.entity.Citizen;
import com.bendiamand.cabas.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CitizenRestController {

    @Autowired
    private CitizenService citizenService;

    // == REST API ==
    @GetMapping("/citizens")
    public List<Citizen> getAllCitizens(){
        List<Citizen> citizens = citizenService.findAll();
        return citizens;
    }

    @GetMapping("/citizens/{citizenId}")
    public Citizen getCitizen(@PathVariable int citizenId) {
        Citizen citizen = citizenService.findById(citizenId);
        return citizen;
    }

    @PostMapping("/citizens")
    public Citizen addCitizen(@RequestBody Citizen citizen){
        citizenService.save(citizen);
        return citizen;
    }

    @PutMapping("/citizens")
    public Citizen updateCitizen(@RequestBody Citizen citizen){
        citizenService.save(citizen);
        return citizen;
    }

    @DeleteMapping("/citizens/{citizenId}")
    public String deleteCitizen(@PathVariable int citizenId){
        citizenService.deleteById(citizenId);
        return "Successfully deleted citizen id: " + citizenId;
    }
}
