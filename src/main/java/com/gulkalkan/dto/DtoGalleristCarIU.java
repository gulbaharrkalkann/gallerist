package com.gulkalkan.dto;

import com.gulkalkan.model.Car;
import com.gulkalkan.model.Gallerist;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DtoGalleristCarIU {

    @NotNull
    private Long galleristId;

   @NotNull
    private Long carId;
}
