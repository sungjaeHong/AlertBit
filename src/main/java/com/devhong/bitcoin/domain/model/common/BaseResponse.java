package com.devhong.bitcoin.domain.model.common;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by devHong on 2018. 1. 13..
 */
@Getter
@Setter
public class BaseResponse {
    ErrorDto errorDto;
    ResponseStatusEnum status;

    public BaseResponse() {
        this.status = ResponseStatusEnum.SUCCESS;
    }
    public BaseResponse(ErrorDto errorDto) {
        this.errorDto = errorDto;
        status = ResponseStatusEnum.FAIL;
    }
    public Boolean isSuccess() {
        return this.status == ResponseStatusEnum.SUCCESS;
    }
}
