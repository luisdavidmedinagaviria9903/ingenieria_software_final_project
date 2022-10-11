package com.ingenieria.software.demo.business;

import com.ingenieria.software.demo.dto.SicknessDto;

import java.util.List;

public interface SicknessBusiness {

    SicknessDto save(SicknessDto sicknessDto);
    List<SicknessDto> findAll();
}
