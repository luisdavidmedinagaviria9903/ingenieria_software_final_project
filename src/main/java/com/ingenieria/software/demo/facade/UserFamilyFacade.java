package com.ingenieria.software.demo.facade;

import com.ingenieria.software.demo.dto.UserFamilyDto;

import java.util.List;

public interface UserFamilyFacade {

    UserFamilyDto save(UserFamilyDto userFamilyDto);
    List<UserFamilyDto> findAllByUser_Email(String userEmail);
}
