package com.gulkalkan.controller.impl;

import com.gulkalkan.controller.IRestAddressController;
import com.gulkalkan.controller.RestBaseController;
import com.gulkalkan.controller.RootEntity;
import com.gulkalkan.dto.DtoAddress;
import com.gulkalkan.dto.DtoAddressIU;
import com.gulkalkan.service.IAddressService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/api/address")
public class RestAddressControllerImpl extends RestBaseController implements IRestAddressController {

    @Autowired
    private IAddressService addressService;



    @PostMapping("/save")
    @Override
    public RootEntity<DtoAddress> saveAddress(@Valid @RequestBody DtoAddressIU dtoAddressIU) {
        return ok(addressService.saveAddress(dtoAddressIU));
    }
}
