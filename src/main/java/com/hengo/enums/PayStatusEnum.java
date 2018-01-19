package com.hengo.enums;

import lombok.Getter;

/**
 * Created by Hengo.
 * 2018/1/11 18:09
 */
@Getter
public enum PayStatusEnum implements CodeEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功")
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
