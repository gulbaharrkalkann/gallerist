package com.gulkalkan.dto;

import com.gulkalkan.model.Car;
import com.gulkalkan.model.Gallerist;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DtoGalleristCar extends DtoBase {

    private DtoGallerist gallerist;

    private DtoCar car;
}
