package com.ingenieria.software.demo.facade;

import com.ingenieria.software.demo.dto.SicknessDto;

import java.util.List;

public interface SicknessFacade {

    SicknessDto save(SicknessDto sicknessDto);
    List<SicknessDto> findAll();
}
