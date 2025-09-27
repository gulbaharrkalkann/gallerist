package com.gulkalkan.controller.impl;

import com.gulkalkan.controller.IRestCustomerController;
import com.gulkalkan.controller.RestBaseController;
import com.gulkalkan.controller.RootEntity;
import com.gulkalkan.dto.DtoCustomer;
import com.gulkalkan.dto.DtoCustomerIU;
import com.gulkalkan.service.ICustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/customer")
public class RestCustomerControllerImpl extends RestBaseController implements IRestCustomerController {


    @Autowired
    private ICustomerService customerService;


    @PostMapping("/save")
    @Override
    public RootEntity<DtoCustomer> saveCustomer(@Valid @RequestBody DtoCustomerIU dtoCustomerIU) {

        return ok(customerService.saveCustomer(dtoCustomerIU));

    }
}
