package com.gulkalkan.controller;

import com.gulkalkan.dto.DtoAddress;
import com.gulkalkan.dto.DtoAddressIU;

public interface IRestAddressController {
    public RootEntity<DtoAddress> saveAddress(DtoAddressIU dtoAddressIU);
}
