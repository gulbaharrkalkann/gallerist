package com.gulkalkan.service;

import com.gulkalkan.dto.DtoCustomer;
import com.gulkalkan.dto.DtoCustomerIU;

public interface ICustomerService {

    public DtoCustomer saveCustomer(DtoCustomerIU dtoCustomerIU);
}
