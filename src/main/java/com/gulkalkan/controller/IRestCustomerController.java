package com.gulkalkan.controller;

import com.gulkalkan.dto.DtoCustomer;
import com.gulkalkan.dto.DtoCustomerIU;

public interface IRestCustomerController {

    public RootEntity<DtoCustomer> saveCustomer(DtoCustomerIU dtoCustomerIU);
}
