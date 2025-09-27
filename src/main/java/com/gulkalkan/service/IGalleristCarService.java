package com.gulkalkan.service;

import com.gulkalkan.dto.DtoGalleristCar;
import com.gulkalkan.dto.DtoGalleristCarIU;

public interface IGalleristCarService {

    public DtoGalleristCar saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU);
}
