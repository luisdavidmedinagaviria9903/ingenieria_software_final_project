package com.ingenieria.software.demo.mapper;

import com.ingenieria.software.demo.domain.UserFamily;
import com.ingenieria.software.demo.dto.UserFamilyDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserFamilyMapper {
    UserFamilyDto convertTo(UserFamily userFamily);
    UserFamily convertTo(UserFamilyDto userFamilyDto);

}
