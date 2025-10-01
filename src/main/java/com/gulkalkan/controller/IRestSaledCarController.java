package com.gulkalkan.controller;

import com.gulkalkan.dto.DtoSaledCar;
import com.gulkalkan.dto.DtoSaledCarIU;

public interface IRestSaledCarController {

    public RootEntity<DtoSaledCar> buyCar(DtoSaledCarIU dtoSaledCarIU);
}
