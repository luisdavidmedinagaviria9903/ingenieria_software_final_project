package com.ingenieria.software.demo.facade.impl;

import com.ingenieria.software.demo.dto.HealthConditionDto;
import com.ingenieria.software.demo.facade.HealthConditionFacade;
import com.ingenieria.software.demo.mapper.HealthConditionMapper;
import com.ingenieria.software.demo.service.HealthConditionService;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
public class HealthConditionFacadeImpl implements HealthConditionFacade {

    private final HealthConditionService healthConditionService;
    private final HealthConditionMapper healthConditionMapper = Mappers.getMapper(HealthConditionMapper.class);

    public HealthConditionFacadeImpl(HealthConditionService healthConditionService) {

        this.healthConditionService = healthConditionService;
    }

    @Override
    public HealthConditionDto save(HealthConditionDto healthConditionDto) {
        return healthConditionMapper.convertTo(
                this.healthConditionService.save(healthConditionMapper.convertTo(healthConditionDto))
        );
    }
}
