package com.bendiamand.cabas.controller;

import com.bendiamand.cabas.model.AlertMessage;
import com.bendiamand.cabas.entity.Area;
import com.bendiamand.cabas.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class CabasController {

    // == Fields ==
    @Autowired
    private AreaService areaService;

    @Autowired
    private AlertMessage alertMessage;

    // == Routing ==
    @GetMapping("/")
    public String homePage(Model model) {
        List<Area> areaList = areaService.findAll();
        model.addAttribute("areas", areaList);
        return "index";
    }

    @GetMapping("/sendAlert")
    public String sendAlert(@ModelAttribute("areaId") int id, @ModelAttribute("severity") String level) {
        alertMessage.message(id, level);
        return "redirect:/";
    }
}
