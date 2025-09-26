package com.gulkalkan.service;

import com.gulkalkan.dto.DtoAddress;
import com.gulkalkan.dto.DtoAddressIU;

public interface IAddressService {


    public DtoAddress saveAddress(DtoAddressIU dtoAddressIU);
}
