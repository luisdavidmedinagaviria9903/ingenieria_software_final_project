package com.ingenieria.software.demo.business;

import com.ingenieria.software.demo.dto.UserFamilyDto;

import java.util.List;

public interface UserFamilyBusiness {
    UserFamilyDto save(UserFamilyDto userFamilyDto);
    List<UserFamilyDto> findAllByUser_Email(String userEmail);
}
