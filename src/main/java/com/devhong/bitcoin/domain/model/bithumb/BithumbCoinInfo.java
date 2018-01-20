package com.devhong.bitcoin.domain.model.bithumb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by devHong on 2018. 1. 13..
 */
@Getter
@Setter
public class BithumbCoinInfo {
    @JsonProperty(value = "opening_price")
    private String openingPrice;
    @JsonProperty(value = "closing_price")
    private String closingPrice;
    @JsonProperty(value = "min_price")
    private String minPrice;
    @JsonProperty(value = "max_price")
    private String maxPrice;
    @JsonProperty(value = "average_price")
    private String averagePrice;
    @JsonProperty(value = "units_traded")
    private String unitsTraded;
    @JsonProperty(value = "volume_1day")
    private String volume1day;
    @JsonProperty(value = "volume_7day")
    private String volume7day;
    @JsonProperty(value = "buy_price")
    private String buyPrice;
    @JsonProperty(value = "sell_price")
    private String sellPrice;

}
