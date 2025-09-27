package com.gulkalkan.controller.impl;

import com.gulkalkan.controller.IRestCarController;
import com.gulkalkan.controller.RestBaseController;
import com.gulkalkan.controller.RootEntity;
import com.gulkalkan.dto.DtoCar;
import com.gulkalkan.dto.DtoCarIU;
import com.gulkalkan.service.ICarService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/car")
public class RestCarControllerImpl extends RestBaseController implements IRestCarController {


    @Autowired
    private ICarService carService;


    @PostMapping("/save")
    @Override
    public RootEntity<DtoCar> saveCar(@Valid @RequestBody DtoCarIU dtoCarIU) {
        return ok(carService.saveCar(dtoCarIU));
    }
}
