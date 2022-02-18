package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// this is a Rest Controller
@RestController
public class WeatherResponseController {

    @Autowired
    ServiceResponse serviceResponse;

    @RequestMapping(value = "/getWeather/{ville}", method = RequestMethod.GET)
    public String getResponse(@PathVariable(value = "ville") String ville) {
        return serviceResponse.callResponse(ville);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getResponseTest() {
        return "test";
    }



}



