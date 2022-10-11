package com.ingenieria.software.demo.service;

import com.ingenieria.software.demo.domain.Sickness;

import java.util.List;

public interface SicknessService {

    Sickness save(Sickness sickness);

    List<Sickness> findAll();
}
