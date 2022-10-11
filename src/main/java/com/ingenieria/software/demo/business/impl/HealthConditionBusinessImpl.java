package com.ingenieria.software.demo.business.impl;

import com.ingenieria.software.demo.business.HealthConditionBusiness;
import com.ingenieria.software.demo.business.SicknessBusiness;
import com.ingenieria.software.demo.dto.HealthConditionDto;
import com.ingenieria.software.demo.dto.HealthConditionRequestDto;
import com.ingenieria.software.demo.dto.SicknessDto;
import com.ingenieria.software.demo.facade.HealthConditionFacade;
import com.ingenieria.software.demo.facade.UserFacade;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class HealthConditionBusinessImpl implements HealthConditionBusiness {

    private final UserFacade userFacade;
    private final SicknessBusiness sicknessBusiness;
    private final HealthConditionFacade healthConditionFacade;

    public HealthConditionBusinessImpl(UserFacade userFacade, SicknessBusiness sicknessBusiness,
                                       HealthConditionFacade healthConditionFacade) {
        this.userFacade = userFacade;
        this.sicknessBusiness = sicknessBusiness;
        this.healthConditionFacade = healthConditionFacade;
    }

    @Override
    public HealthConditionDto save(HealthConditionRequestDto healthConditionRequestDto) {

        HealthConditionDto healthConditionDto = new HealthConditionDto();
        healthConditionDto.setCreationDate(LocalDateTime.now());
        healthConditionDto.setIsFamily(healthConditionRequestDto.getIsFamily());

        if (!healthConditionRequestDto.getIsFamily()){
            healthConditionDto.setUser(this.userFacade.findByEmail(healthConditionRequestDto.getUserEmail()).getId());
        }else {
            healthConditionDto.setUser(healthConditionRequestDto.getUserId());

        }


        if (healthConditionRequestDto.getSicknessCode().equals(0L) && healthConditionRequestDto.getSicknessDescription() != null){

            SicknessDto sicknessDto = new SicknessDto();
            sicknessDto.setDescription(healthConditionRequestDto.getSicknessDescription());
            sicknessDto = this.sicknessBusiness.save(sicknessDto);

            healthConditionDto.setSicknessCode(sicknessDto.getId());

        }else {
            healthConditionDto.setSicknessCode(healthConditionRequestDto.getSicknessCode());
        }



        return this.healthConditionFacade.save(healthConditionDto);
    }
}
