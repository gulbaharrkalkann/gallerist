package com.gulkalkan.controller;

import com.gulkalkan.dto.DtoGalleristCar;
import com.gulkalkan.dto.DtoGalleristCarIU;

public interface IRestGalleristCarController {

    public RootEntity<DtoGalleristCar> saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU);
}
