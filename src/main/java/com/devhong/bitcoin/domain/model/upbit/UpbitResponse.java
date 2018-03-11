package com.devhong.bitcoin.domain.model.upbit;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by devHong on 2018. 3. 3..
 */

@Getter
@Setter
public class UpbitResponse {
    UpbitCoinInfo BTC;
    UpbitCoinInfo STRAT;
    UpbitCoinInfo ETH;
}
