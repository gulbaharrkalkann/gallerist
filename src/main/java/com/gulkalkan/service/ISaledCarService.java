package com.gulkalkan.service;

import com.gulkalkan.dto.DtoSaledCar;
import com.gulkalkan.dto.DtoSaledCarIU;

public interface ISaledCarService {

    public DtoSaledCar buyCar(DtoSaledCarIU dtoSaledCarIU);
}
