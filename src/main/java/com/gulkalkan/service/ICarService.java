package com.gulkalkan.service;

import com.gulkalkan.dto.DtoCar;
import com.gulkalkan.dto.DtoCarIU;

public interface ICarService {

    public DtoCar saveCar(DtoCarIU dtoCarIU);
}
