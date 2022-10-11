package com.ingenieria.software.demo.mapper;

import com.ingenieria.software.demo.domain.Sickness;
import com.ingenieria.software.demo.dto.SicknessDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface SicknessMapper {

    SicknessDto convertTo(Sickness sickness);
    Sickness convertTo(SicknessDto sickness);
}
