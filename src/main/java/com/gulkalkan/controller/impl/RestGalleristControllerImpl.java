package com.gulkalkan.controller.impl;

import com.gulkalkan.controller.IRestGalleristController;
import com.gulkalkan.controller.RestBaseController;
import com.gulkalkan.controller.RootEntity;
import com.gulkalkan.dto.DtoGallerist;
import com.gulkalkan.dto.DtoGalleristIU;
import com.gulkalkan.service.IGalleristService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/gallerist")
public class RestGalleristControllerImpl extends RestBaseController implements IRestGalleristController {


    @Autowired
    private IGalleristService galleristService;
@PostMapping("/save")
    @Override
    public RootEntity<DtoGallerist> saveGallerist(@Valid @RequestBody DtoGalleristIU dtoGalleristIU) {

    return ok(galleristService.saveGallerist(dtoGalleristIU));

    }
}
