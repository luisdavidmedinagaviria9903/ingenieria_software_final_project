package com.ingenieria.software.demo.business;

import com.ingenieria.software.demo.dto.UserCredentialsDto;
import com.ingenieria.software.demo.dto.UserDto;

public interface UserBusiness {

    UserDto findByEmail(String email);
    UserDto save(UserDto user);
    Boolean login(UserCredentialsDto userCredentialsDto);
}
