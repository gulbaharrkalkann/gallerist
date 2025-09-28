package com.gulkalkan.service;

import com.gulkalkan.dto.CurrencyRatesItems;
import com.gulkalkan.dto.CurrencyRatesResponse;

public interface ICurrencyRatesService {

    public CurrencyRatesResponse getCurrencyRates(String startDate, String endDate);
}
