package com.ingenieria.software.demo.facade;

import com.ingenieria.software.demo.domain.User;
import com.ingenieria.software.demo.dto.UserDto;
import org.mapstruct.control.MappingControl;

public interface UserFacade {

    UserDto findByEmail(String email);
    UserDto save(UserDto user);
}
