package com.ingenieria.software.demo.facade.impl;

import com.ingenieria.software.demo.dto.UserDto;
import com.ingenieria.software.demo.facade.UserFacade;
import com.ingenieria.software.demo.mapper.UserMapper;
import com.ingenieria.software.demo.service.UserService;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
public class UserFacadeImpl implements UserFacade {

    private final UserMapper userMapper = Mappers.getMapper(UserMapper.class);
    private final UserService userService;

    public UserFacadeImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDto findByEmail(String email) {
        return this.userMapper.convertTo(this.userService.findByEmail(email));
    }

    @Override
    public UserDto save(UserDto user) {
        return this.userMapper.convertTo(
                this.userService.save(this.userMapper.convertTo(user))
        );
    }
}
