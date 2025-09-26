package com.gulkalkan.service.impl;

import com.gulkalkan.dto.DtoAddress;
import com.gulkalkan.dto.DtoAddressIU;
import com.gulkalkan.exception.BaseException;
import com.gulkalkan.exception.ErrorMessage;
import com.gulkalkan.exception.MessageType;
import com.gulkalkan.model.Address;
import com.gulkalkan.repository.AddressRepository;
import com.gulkalkan.service.IAddressService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private AddressRepository addressRepository;


    private Address createAddress(DtoAddressIU dtoAddressIU) {
        Address address = new Address();
        address.setCreateTime(new Date());

        BeanUtils.copyProperties(dtoAddressIU,address);
        return  address;

    }
    @Override
    public DtoAddress saveAddress(DtoAddressIU dtoAddressIU) {
        DtoAddress dtoAddress = new DtoAddress();


        Address savedAddress=addressRepository.save(createAddress(dtoAddressIU));
        BeanUtils.copyProperties(savedAddress,dtoAddress);

        return dtoAddress;
    }
}
