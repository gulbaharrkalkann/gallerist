package com.gulkalkan.service;

import com.gulkalkan.dto.AuthRequest;
import com.gulkalkan.dto.AuthResponse;
import com.gulkalkan.dto.DtoUser;
import com.gulkalkan.dto.RefreshTokenRequest;

public interface IAuthenticationService {

    public DtoUser register(AuthRequest input);

    public AuthResponse authenticate (AuthRequest input);

    public AuthResponse refreshToken(RefreshTokenRequest input);

}
