package com.devhong.bitcoin.domain.model.upbit;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.time.OffsetDateTime;

/**
 * Created by devHong on 2018. 3. 3..
 */
@Getter
@Setter
@ToString
public class UpbitCoinInfo {

    @JsonProperty(value = "code")
    private String code;

    @JsonProperty(value = "candleDateTime")
    private OffsetDateTime candleDateTime;

    @JsonProperty(value = "candleDateTimeKst")
    private OffsetDateTime candleDateTimeKst;

    @JsonProperty(value = "openingPrice")
    private Integer openingPrice;

    @JsonProperty(value = "highPrice")
    private Integer highPrice;

    @JsonProperty(value = "lowPrice")
    private Integer lowPrice;

    @JsonProperty(value = "tradePrice")
    private Integer tradePrice;

    @JsonProperty(value = "candleAccTradeVolume")
    private Double candleAccTradeVolume;

    @JsonProperty(value = "candleAccTradePrice")
    private Double candleAccTradePrice;

    @JsonProperty(value = "timestamp")
    private Timestamp timestamp;

    @JsonProperty(value = "unit")
    private Integer unit;
}
