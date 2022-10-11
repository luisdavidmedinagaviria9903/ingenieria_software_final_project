package com.ingenieria.software.demo.business.impl;

import com.ingenieria.software.demo.business.SicknessBusiness;
import com.ingenieria.software.demo.dto.SicknessDto;
import com.ingenieria.software.demo.facade.SicknessFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SicknessBusinessImpl implements SicknessBusiness {

    private final SicknessFacade sicknessFacade;

    public SicknessBusinessImpl(SicknessFacade sicknessFacade) {
        this.sicknessFacade = sicknessFacade;
    }

    @Override
    public SicknessDto save(SicknessDto sicknessDto) {
        return this.sicknessFacade.save(sicknessDto);
    }

    @Override
    public List<SicknessDto> findAll() {
        return this.sicknessFacade.findAll();
    }
}
