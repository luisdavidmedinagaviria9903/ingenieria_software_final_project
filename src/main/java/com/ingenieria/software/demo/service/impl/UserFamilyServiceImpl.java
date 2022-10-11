package com.ingenieria.software.demo.service.impl;

import com.ingenieria.software.demo.domain.UserFamily;
import com.ingenieria.software.demo.repository.UserFamilyRepository;
import com.ingenieria.software.demo.service.UserFamilyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFamilyServiceImpl implements UserFamilyService {

    private final UserFamilyRepository userFamilyRepository;

    public UserFamilyServiceImpl(UserFamilyRepository userFamilyRepository) {
        this.userFamilyRepository = userFamilyRepository;
    }

    @Override
    public UserFamily save(UserFamily userFamily) {
        return this.userFamilyRepository.saveAndFlush(userFamily);
    }

    @Override
    public List<UserFamily> findAllByUser_Email(String userEmail) {
        return this.userFamilyRepository.findAllByUser_Email(userEmail);
    }
}
