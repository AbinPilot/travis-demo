package com.cicd.travisdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TravelController {

    @GetMapping("/destinations")
    public String getTouristDestinations(){
        return "Italy";
    }
}
