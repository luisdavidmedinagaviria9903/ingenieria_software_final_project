package com.ingenieria.software.demo.mapper;

import com.ingenieria.software.demo.domain.User;
import com.ingenieria.software.demo.dto.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto convertTo(User user);
    User convertTo(UserDto user);
}
