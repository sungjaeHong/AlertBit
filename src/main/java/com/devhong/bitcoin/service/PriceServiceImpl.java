package com.devhong.bitcoin.service;

import com.devhong.bitcoin.domain.model.bithumb.BithumbResponse;
import com.devhong.bitcoin.domain.model.upbit.UpbitCoinInfo;
import com.devhong.bitcoin.domain.model.upbit.UpbitData;
import com.devhong.bitcoin.domain.model.upbit.UpbitResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by devHong on 2018. 3. 3..
 */
@Service
@Slf4j
public class PriceServiceImpl implements PriceService{

    @Value(value = "${bithumb.api.url}")
    private String bithumbApiUrl;

    @Value(value = "${upbit.api.url}")
    private String upbitApiUrl;

    @Override
    public BithumbResponse getAllPriceByBithumb() {
        BithumbResponse response = new RestTemplate().getForObject(bithumbApiUrl, BithumbResponse.class);
        return response;
    }

    @Override
    public UpbitResponse getAllPriceByUpbit() {
        UpbitResponse response = new UpbitResponse();
        UpbitCoinInfo[] BTC_DATA = new RestTemplate().getForObject(upbitApiUrl + "BTC", UpbitCoinInfo[].class);
        UpbitCoinInfo[] STRAT_DATA = new RestTemplate().getForObject(upbitApiUrl + "STRAT", UpbitCoinInfo[].class);
        UpbitCoinInfo[] ETH_DATA = new RestTemplate().getForObject(upbitApiUrl + "ETH", UpbitCoinInfo[].class);

        response.setBTC(BTC_DATA[0]);
        response.setSTRAT(STRAT_DATA[0]);
        response.setETH(ETH_DATA[0]);

        return response;
    }
}
