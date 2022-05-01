package com.bendiamand.cabas.model;

import com.bendiamand.cabas.entity.Area;
import com.bendiamand.cabas.entity.Citizen;
import com.bendiamand.cabas.entity.City;
import com.bendiamand.cabas.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AlertMessage {

    @Autowired
    AreaService areaService;
    private static int numOfMessage = 0;


    public AlertMessage(AreaService areaService) {
        this.areaService = areaService;
    }

    private void printMessage(Area area, City city, Citizen citizen, String severity) {
        if (citizen.getGuardian() != null) {
            countMessages();
            System.out.println("Hi " + citizen.getGuardian().getFirstName() + ", You are guardian of " +
                    citizen.getFirstName() + " " + citizen.getLastName() + " There is a " + severity +
                    " coronavirus outbreak in his area " + area.getName());
        }
        countMessages();
        System.out.println("Hi " + citizen.getFirstName() +
                " " + citizen.getLastName() + ", there is a " + severity +
                " coronavirus outbreak in your city " + city.getName());
    }

    private void countMessages() {
        numOfMessage++;
        System.out.println("=== MESSAGE NO." + numOfMessage + " ===");
    }

    public void message(int id, String Severity) {
        Area area = areaService.findById(id);
        List<City> cities = area.getCities();
        if (!cities.isEmpty()) {
            for (City city : cities) {
                List<Citizen> citizens = city.getCitizens();
                if (!citizens.isEmpty()) {
                    for (Citizen citizen : citizens) {
                        printMessage(area, city, citizen, Severity);
                    }
                } else {
                    countMessages();
                    System.out.println("All citizens in " + city.getName() + " are dead from coronavirus!\n");
                }
            }
        } else {
            countMessages();
            System.out.println("There are no cities here\n");
        }
    }
}
