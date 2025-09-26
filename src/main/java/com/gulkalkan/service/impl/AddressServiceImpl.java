package com.gulkalkan.service.impl;

import com.gulkalkan.exception.BaseException;
import com.gulkalkan.exception.ErrorMessage;
import com.gulkalkan.exception.MessageType;
import com.gulkalkan.service.IAddressService;

public class AddressServiceImpl implements IAddressService {

    public void test(){
        throw new BaseException(new ErrorMessage(null, null));
    }
}
