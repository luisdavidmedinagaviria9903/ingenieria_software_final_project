package com.ingenieria.software.demo.business.impl;

import com.ingenieria.software.demo.business.UserBusiness;
import com.ingenieria.software.demo.dto.UserCredentialsDto;
import com.ingenieria.software.demo.dto.UserDto;
import com.ingenieria.software.demo.facade.UserFacade;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserBusinessImpl implements UserBusiness {

    private final UserFacade userFacade;

    public UserBusinessImpl(UserFacade userFacade) {
        this.userFacade = userFacade;
    }

    @Override
    public UserDto findByEmail(String email) {
        return this.userFacade.findByEmail(email);
    }

    @Override
    public UserDto save(UserDto user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return this.userFacade.save(user);
    }

    @Override
    public Boolean login(UserCredentialsDto userCredentialsDto) {
        UserDto user = this.findByEmail(userCredentialsDto.getEmail());
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.matches(userCredentialsDto.getPassword(), user.getPassword());
    }
}
