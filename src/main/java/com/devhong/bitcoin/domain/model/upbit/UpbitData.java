package com.devhong.bitcoin.domain.model.upbit;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by devHong on 2018. 3. 3..
 */

@Getter
@Setter
public class UpbitData {
    List<UpbitCoinInfo> data;
}
