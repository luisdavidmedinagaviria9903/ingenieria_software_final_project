package com.ingenieria.software.demo.facade.impl;

import com.ingenieria.software.demo.dto.SicknessDto;
import com.ingenieria.software.demo.facade.SicknessFacade;
import com.ingenieria.software.demo.mapper.SicknessMapper;
import com.ingenieria.software.demo.service.SicknessService;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SicknessFacadeImpl  implements SicknessFacade {

    private final SicknessMapper sicknessMapper = Mappers.getMapper(SicknessMapper.class);
    private final SicknessService sicknessService;

    public SicknessFacadeImpl(SicknessService sicknessService) {
        this.sicknessService = sicknessService;
    }

    @Override
    public SicknessDto save(SicknessDto sicknessDto) {
        return sicknessMapper.convertTo(
                this.sicknessService.save(sicknessMapper.convertTo(sicknessDto))
        );
    }

    @Override
    public List<SicknessDto> findAll() {
        return this.sicknessService.findAll()
                .stream().map(this.sicknessMapper::convertTo).collect(Collectors.toList());
    }
}
