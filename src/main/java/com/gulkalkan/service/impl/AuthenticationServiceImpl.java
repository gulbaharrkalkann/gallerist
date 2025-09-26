package com.gulkalkan.service.impl;

import com.gulkalkan.dto.AuthRequest;
import com.gulkalkan.dto.DtoUser;
import com.gulkalkan.model.User;
import com.gulkalkan.repository.UserRepository;
import com.gulkalkan.service.IAuthenticationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AuthenticationServiceImpl implements IAuthenticationService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    private User createUser(AuthRequest input){
        User user = new User();
        user.setCreateTime(new Date());
        user.setUsername(input.getUsername());
        user.setPassword(passwordEncoder.encode(input.getPassword()));
        return user;
    }

    @Override
    public DtoUser register(AuthRequest input) {

        DtoUser dtoUser = new DtoUser();
        User savedUser=userRepository.save(createUser(input));
        BeanUtils.copyProperties(savedUser,dtoUser);
        return dtoUser;
    }
}
