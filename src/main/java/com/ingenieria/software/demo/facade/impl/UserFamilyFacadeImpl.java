package com.ingenieria.software.demo.facade.impl;

import com.ingenieria.software.demo.dto.UserFamilyDto;
import com.ingenieria.software.demo.facade.UserFamilyFacade;
import com.ingenieria.software.demo.mapper.UserFamilyMapper;
import com.ingenieria.software.demo.service.UserFamilyService;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserFamilyFacadeImpl implements UserFamilyFacade {

    private final UserFamilyService userFamilyService;
    private final UserFamilyMapper userFamilyMapper = Mappers.getMapper(UserFamilyMapper.class);

    public UserFamilyFacadeImpl(UserFamilyService userFamilyService) {
        this.userFamilyService = userFamilyService;
    }

    @Override
    public UserFamilyDto save(UserFamilyDto userFamilyDto) {
        return userFamilyMapper.convertTo(
                this.userFamilyService.save(userFamilyMapper.convertTo(userFamilyDto))
        );
    }

    @Override
    public List<UserFamilyDto> findAllByUser_Email(String userEmail) {
        return this.userFamilyService.findAllByUser_Email(userEmail)
                .stream().map(this.userFamilyMapper::convertTo)
                .collect(Collectors.toList());
    }
}
