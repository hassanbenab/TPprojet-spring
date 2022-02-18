package com.example.demo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceResponse {

    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "callWeatherServiceAndGetData_Fallback")
    public String callResponse(String ville) {

        String response = restTemplate
                .exchange("http://localhost:8080/getTempByVille/{ville}"
                        , HttpMethod.GET
                        , null
                        , new ParameterizedTypeReference<String>() {
                        }, ville).getBody();

        return "this is my result : " + response;
    }


    private String callWeatherServiceAndGetData_Fallback(String ville) {
        System.out.println("Weather Service is down!!! fallback route enabled...");

        return "CIRCUIT BREAKER ENABLED!!!No Response From Weather Service at this moment. Service will be back shortly - ";
    }




    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
