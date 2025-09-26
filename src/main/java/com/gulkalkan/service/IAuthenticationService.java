package com.gulkalkan.service;

import com.gulkalkan.dto.AuthRequest;
import com.gulkalkan.dto.DtoUser;

public interface IAuthenticationService {

    public DtoUser register(AuthRequest input);


}
