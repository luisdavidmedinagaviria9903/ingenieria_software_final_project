package com.ingenieria.software.demo.business;

import com.ingenieria.software.demo.dto.HealthConditionDto;
import com.ingenieria.software.demo.dto.HealthConditionRequestDto;

public interface HealthConditionBusiness {

    HealthConditionDto save(HealthConditionRequestDto healthConditionRequestDto);
}
