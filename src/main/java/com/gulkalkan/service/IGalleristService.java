package com.gulkalkan.service;

import com.gulkalkan.dto.DtoGallerist;
import com.gulkalkan.dto.DtoGalleristIU;

public interface IGalleristService {

    public DtoGallerist saveGallerist(DtoGalleristIU dtoGalleristIU);
}
