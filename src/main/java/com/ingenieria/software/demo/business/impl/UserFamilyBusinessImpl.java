package com.ingenieria.software.demo.business.impl;

import com.ingenieria.software.demo.business.UserFamilyBusiness;
import com.ingenieria.software.demo.dto.UserFamilyDto;
import com.ingenieria.software.demo.facade.UserFacade;
import com.ingenieria.software.demo.facade.UserFamilyFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserFamilyBusinessImpl implements UserFamilyBusiness {

    private final UserFamilyFacade userFamilyFacade;
    private final UserFacade userFacade;

    public UserFamilyBusinessImpl(UserFamilyFacade userFamilyFacade, UserFacade userFacade) {
        this.userFamilyFacade = userFamilyFacade;
        this.userFacade = userFacade;
    }

    @Override
    public UserFamilyDto save(UserFamilyDto userFamilyDto) {
        userFamilyDto.setUser(this.userFacade.findByEmail(userFamilyDto.getUser().getEmail()));
        return this.userFamilyFacade.save(userFamilyDto);
    }

    @Override
    public List<UserFamilyDto> findAllByUser_Email(String userEmail) {
        return this.userFamilyFacade.findAllByUser_Email(userEmail);
    }
}
