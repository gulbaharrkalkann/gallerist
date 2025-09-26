package com.gulkalkan.controller;

import com.gulkalkan.dto.AuthRequest;
import com.gulkalkan.dto.DtoUser;

public interface IRestAuthenticationController {

    public RootEntity<DtoUser> register(AuthRequest input);
}
