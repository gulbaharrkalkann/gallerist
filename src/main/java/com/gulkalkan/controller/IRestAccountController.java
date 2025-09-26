package com.gulkalkan.controller;

import com.gulkalkan.dto.DtoAccount;
import com.gulkalkan.dto.DtoAccountIU;

public interface IRestAccountController  {

    public RootEntity<DtoAccount> saveAccount(DtoAccountIU dtoAccountIU);

}
