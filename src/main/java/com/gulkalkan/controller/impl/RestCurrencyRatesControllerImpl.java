package com.gulkalkan.controller.impl;

import com.gulkalkan.controller.IRestCurrencyController;
import com.gulkalkan.controller.RestBaseController;
import com.gulkalkan.controller.RootEntity;
import com.gulkalkan.dto.CurrencyRatesResponse;
import com.gulkalkan.service.ICurrencyRatesService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
public class RestCurrencyRatesControllerImpl  extends RestBaseController implements IRestCurrencyController {


    @Autowired
    private ICurrencyRatesService currencyRatesService;


    @GetMapping("/currency-rates")
    @Override
    public RootEntity<CurrencyRatesResponse> getCurrencyRates(
            @RequestParam("startDate") String startDate,@RequestParam("endDate") String endDate) {

        return ok(currencyRatesService.getCurrencyRates(startDate, endDate));
    }
}
