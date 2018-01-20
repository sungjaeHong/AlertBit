package com.devhong.bitcoin.domain.model.common;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

/**
 * Created by devHong on 2018. 1. 13..
 */

@Getter
@Setter
public class ErrorDto {
    private HttpStatus code;
    private String message;
    public ErrorDto(HttpStatus status, String message) {
        this.code = status;
        this.message = message;
    }
}
