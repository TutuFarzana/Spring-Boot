package com.qburst.controller;

import com.qburst.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    CityService cityService;

    @RequestMapping("/")
    public String greeting(Model model) {
        model.addAttribute("cities", cityService.findAll());
        return "hello";
    }
}
