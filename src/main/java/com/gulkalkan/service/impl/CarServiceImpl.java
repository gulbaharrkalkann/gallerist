package com.gulkalkan.service.impl;

import com.gulkalkan.dto.DtoCar;
import com.gulkalkan.dto.DtoCarIU;
import com.gulkalkan.model.Car;
import com.gulkalkan.repository.CarRepository;
import com.gulkalkan.service.ICarService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CarServiceImpl implements ICarService {

    @Autowired
   private   CarRepository carRepository;

    private Car createCar(DtoCarIU dtoCarIU) {
        Car car = new Car();
        car.setCreateTime(new Date());

        BeanUtils.copyProperties(dtoCarIU, car);
        return car;
    }
    @Override
    public DtoCar saveCar(DtoCarIU dtoCarIU) {
        DtoCar dtoCar = new DtoCar();

      Car savedCar=  carRepository.save(createCar(dtoCarIU));
        BeanUtils.copyProperties(savedCar, dtoCar);

        return dtoCar;
    }
}
