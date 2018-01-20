package com.devhong.bitcoin.domain.model.bithumb;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by devHong on 2018. 1. 13..
 */
@Getter
@Setter
public class BithumbResponse {
    String status;
    BithumbData data;
}
