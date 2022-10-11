package com.ingenieria.software.demo.mapper;

import com.ingenieria.software.demo.domain.HealthCondition;
import com.ingenieria.software.demo.dto.HealthConditionDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HealthConditionMapper {

    HealthConditionDto convertTo(HealthCondition healthCondition);
    HealthCondition convertTo(HealthConditionDto healthCondition);

}
