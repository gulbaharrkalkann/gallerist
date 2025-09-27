package com.gulkalkan.controller;

import com.gulkalkan.dto.DtoCar;
import com.gulkalkan.dto.DtoCarIU;

public interface IRestCarController {

    public RootEntity<DtoCar> saveCar(DtoCarIU dtoCarIU);
}
