package com.ingenieria.software.demo.service.impl;

import com.ingenieria.software.demo.domain.Sickness;
import com.ingenieria.software.demo.repository.SicknessRepository;
import com.ingenieria.software.demo.service.SicknessService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SicknessServiceImpl implements SicknessService {

    private final SicknessRepository sicknessRepository;

    public SicknessServiceImpl(SicknessRepository sicknessRepository) {
        this.sicknessRepository = sicknessRepository;
    }

    @Override
    public Sickness save(Sickness sickness) {
        return this.sicknessRepository.save(sickness);
    }

    @Override
    public List<Sickness> findAll() {
        return this.sicknessRepository.findAll();
    }
}
