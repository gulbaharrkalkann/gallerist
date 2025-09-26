package com.gulkalkan.service;

import com.gulkalkan.dto.DtoAccount;
import com.gulkalkan.dto.DtoAccountIU;

public interface IAccountService {
    public DtoAccount saveAccount(DtoAccountIU dtoAccountIU);
}
