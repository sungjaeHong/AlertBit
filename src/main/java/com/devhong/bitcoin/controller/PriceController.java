package com.devhong.bitcoin.controller;

import com.devhong.bitcoin.domain.model.bithumb.BithumbResponse;
import com.devhong.bitcoin.domain.model.upbit.UpbitResponse;
import com.devhong.bitcoin.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by devHong on 2018. 1. 13..
 */
@RestController(value = "PriceController")
@RequestMapping(path = "/v1/price")
public class PriceController {

    @Autowired
    PriceService priceService;

    @GetMapping(path = "/bithumb")
    public BithumbResponse getAllPriceByBithumb() {
        return priceService.getAllPriceByBithumb();
    }

    @GetMapping(path = "/upbit")
    public UpbitResponse getAllPriceByUpbit() {
        return priceService.getAllPriceByUpbit();
    }
}
