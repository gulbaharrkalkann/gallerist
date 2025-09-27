package com.gulkalkan.controller;

import com.gulkalkan.dto.DtoGallerist;
import com.gulkalkan.dto.DtoGalleristIU;

public interface IRestGalleristController {
    public RootEntity<DtoGallerist> saveGallerist(DtoGalleristIU dtoGalleristIU);
}
