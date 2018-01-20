package com.devhong.bitcoin.controller;

import com.devhong.bitcoin.domain.model.bithumb.BithumbResponse;
import org.springframework.beans.factory.annotation.Value;
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
    @Value(value = "${bithumb.api.url}")
    private String bithumApiUrl;
    @GetMapping(path = "/all")
    public BithumbResponse getAllPrice() {
        BithumbResponse response = new RestTemplate().getForObject(bithumApiUrl, BithumbResponse.class);
        return response;
    }
}
