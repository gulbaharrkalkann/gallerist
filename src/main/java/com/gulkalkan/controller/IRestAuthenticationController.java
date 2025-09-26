package com.gulkalkan.controller;

import com.gulkalkan.dto.AuthRequest;
import com.gulkalkan.dto.AuthResponse;
import com.gulkalkan.dto.DtoUser;
import com.gulkalkan.dto.RefreshTokenRequest;

public interface IRestAuthenticationController {

    public RootEntity<DtoUser> register(AuthRequest input);

    public RootEntity<AuthResponse> authenticate(AuthRequest input);


    public RootEntity<AuthResponse> refreshToken(RefreshTokenRequest input);
}
