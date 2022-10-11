package com.ingenieria.software.demo.service;

import com.ingenieria.software.demo.domain.UserFamily;

import java.util.List;

public interface UserFamilyService {

    UserFamily save(UserFamily userFamily);

    List<UserFamily> findAllByUser_Email(String userEmail);
}
