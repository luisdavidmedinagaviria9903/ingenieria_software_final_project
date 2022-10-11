package com.ingenieria.software.demo.service.impl;

import com.ingenieria.software.demo.domain.HealthCondition;
import com.ingenieria.software.demo.repository.HealthConditionRepository;
import com.ingenieria.software.demo.service.HealthConditionService;
import org.springframework.stereotype.Service;

@Service
public class HealthConditionServiceImpl implements HealthConditionService {

    private final HealthConditionRepository healthConditionRepository;

    public HealthConditionServiceImpl(HealthConditionRepository healthConditionRepository) {
        this.healthConditionRepository = healthConditionRepository;
    }

    @Override
    public HealthCondition save(HealthCondition healthCondition) {
        return this.healthConditionRepository.saveAndFlush(healthCondition);
    }
}
