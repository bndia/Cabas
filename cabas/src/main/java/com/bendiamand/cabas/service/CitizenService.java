package com.bendiamand.cabas.service;

import com.bendiamand.cabas.entity.Citizen;
import com.bendiamand.cabas.repository.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitizenService{

    // == Fields ==
    @Autowired
    private CitizenRepository citizenRepository;

    // == Constructors ==
    public CitizenService(){
    }

    // == Methods ==
    public List<Citizen> findAll() {
        return citizenRepository.findAll();
    }

    public Citizen findById(int id) {
        return citizenRepository.findById(id).orElseThrow(() -> new RuntimeException("Did not find citizen id - " + id));
    }

    public void save(Citizen citizen) {
        citizenRepository.save(citizen);
    }

    public void deleteById(int id) {
        citizenRepository.deleteById(id);
    }
}
