package com.gulkalkan.exception;

import lombok.Getter;

@Getter
public enum MessageType {
    NO_RECORD_EXIST("1004","No record exist"),
    GENERAL_EXCEPTİON("9999","General exception");


    private String code;

    private String message;

    MessageType(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
