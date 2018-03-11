package com.devhong.bitcoin.service;

import com.devhong.bitcoin.domain.model.bithumb.BithumbResponse;
import com.devhong.bitcoin.domain.model.upbit.UpbitResponse;

/**
 * Created by devHong on 2018. 3. 3..
 */
public interface PriceService {

    BithumbResponse getAllPriceByBithumb();

    UpbitResponse getAllPriceByUpbit();
}
