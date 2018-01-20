package com.devhong.bitcoin.domain.model.bithumb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by devHong on 2018. 1. 13..
 */
@Getter
@Setter
public class BithumbData {
    @JsonProperty(value = "BTC")
    BithumbCoinInfo BTC;
    @JsonProperty(value = "ETH")
    BithumbCoinInfo ETH;
    @JsonProperty(value = "DASH")
    BithumbCoinInfo DASH;
    @JsonProperty(value = "LTC")
    BithumbCoinInfo LTC;
    @JsonProperty(value = "ETC")
    BithumbCoinInfo ETC;
    @JsonProperty(value = "XRP")
    BithumbCoinInfo XRP;
    @JsonProperty(value = "BCH")
    BithumbCoinInfo BCH;
    @JsonProperty(value = "XMR")
    BithumbCoinInfo XMR;
    @JsonProperty(value = "ZEC")
    BithumbCoinInfo ZEC;
    @JsonProperty(value = "QTUM")
    BithumbCoinInfo QTUM;
    @JsonProperty(value = "BTG")
    BithumbCoinInfo BTG;
    @JsonProperty(value = "EOS")
    BithumbCoinInfo EOS;
    String date;
}
