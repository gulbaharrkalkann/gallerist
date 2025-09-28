package com.gulkalkan.service.impl;

import com.gulkalkan.dto.CurrencyRatesResponse;
import com.gulkalkan.exception.BaseException;
import com.gulkalkan.exception.ErrorMessage;
import com.gulkalkan.exception.MessageType;
import com.gulkalkan.service.ICurrencyRatesService;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrencyRatesServiceImpl  implements ICurrencyRatesService {


    @Override
    public CurrencyRatesResponse getCurrencyRates(String startDate, String endDate) {

        String rootURL = "https://evds2.tcmb.gov.tr/service/evds/";
        String series = "TP.DK.USD.A";
        String type = "json";

        String endPoint = rootURL + "series=" + series + "&startDate=" + startDate + "&endDate=" + endDate + "&type=" + type;

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("key", "eK61Ms1z14");

        HttpEntity<?> httpEntity = new HttpEntity<>(httpHeaders);

        RestTemplate restTemplate = new RestTemplate();


        try {
            ResponseEntity<CurrencyRatesResponse> response = restTemplate.exchange(endPoint, HttpMethod.GET, httpEntity, new ParameterizedTypeReference<CurrencyRatesResponse>() {
            });
            if (response.getStatusCode().is2xxSuccessful()) {
                return response.getBody();
            }

        } catch (Exception e) {
            throw new BaseException(new ErrorMessage(MessageType.CURRENCY_RATE_IS_OCCURED, e.getMessage()));
        }
        return  null;


    }
}
