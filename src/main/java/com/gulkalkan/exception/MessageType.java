package com.gulkalkan.exception;

import lombok.Getter;

@Getter
public enum MessageType {
    NO_RECORD_EXIST("1004","No record exist"),
    TOKEN_IS_EXPIRED("1005","Token is expired"),
    USERNAME_NOT_FOUND("1006","Username not found"),
    USERNAME_OR_PASSWORD_INVALID("1007","Username or password invalid"),
    REFRESH_TOKEN_NOT_FOUND("1008","Refresh token not found"),
    REFRESH_TOKEN_IS_EXPIRED("1009","Refresh token is expired"),
    CURRENCY_RATE_IS_OCCURED("1010","DÖVİZ KURU ALINAMADI"),
    CUSTOMER_AMOUNT_IS_NOT_ENOUGH("1011","Customer amount is not enough"),
    CAR_STATUS_IS_ALREADY_SALED("1012","araba satıldığı için satılamaz"),
    GENERAL_EXCEPTION("9999","General exception");


    private String code;

    private String message;

    MessageType(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
