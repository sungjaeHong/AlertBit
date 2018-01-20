package com.devhong.bitcoin.controller;

import com.devhong.bitcoin.domain.model.bithumb.BithumbResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by devHong on 2018. 1. 13..
 */
@RestController
@RequestMapping(path = "/price")
public class PriceController {
    @GetMapping(path = "/all")
    public BithumbResponse getAllPrice() {

        RestTemplate restTemplate = new RestTemplate();
        //ResponseEntity<BithumbResponse> response = restTemplate.getForObject("https://api.bithumb.com/public/ticker/all", BithumbResponse.class);
        BithumbResponse response = restTemplate.getForObject("https://api.bithumb.com/public/ticker/all", BithumbResponse.class);
        return response;
    }
}
