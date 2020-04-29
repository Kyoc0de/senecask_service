package com.kyo.schoolweb.enums;

import lombok.Getter;

@Getter
public enum StatusCodeEnums {

    OK(200,"请求成功"),
    NOT_FOUND(404,"请求的资源不存在"),
    INTERNAL_SERVER_ERROR(500,"内部错误"),
    ;

    Integer code;
    String desc;

    StatusCodeEnums(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
