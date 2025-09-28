package com.gulkalkan.controller;

import com.gulkalkan.dto.CurrencyRatesResponse;

public interface IRestCurrencyController {

    public RootEntity<CurrencyRatesResponse> getCurrencyRates(String startDate, String endDate);

}
