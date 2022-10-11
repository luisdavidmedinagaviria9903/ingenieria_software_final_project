package com.ingenieria.software.demo.controller;

import com.ingenieria.software.demo.business.HealthConditionBusiness;
import com.ingenieria.software.demo.business.SicknessBusiness;
import com.ingenieria.software.demo.business.UserBusiness;
import com.ingenieria.software.demo.business.UserFamilyBusiness;
import com.ingenieria.software.demo.dto.HealthConditionRequestDto;
import com.ingenieria.software.demo.dto.UserCredentialsDto;
import com.ingenieria.software.demo.dto.UserDto;
import com.ingenieria.software.demo.dto.UserFamilyDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(allowedHeaders = "*")
public class UserController {

    private final UserBusiness userBusiness;
    private final UserFamilyBusiness userFamilyBusiness;
    private final SicknessBusiness sicknessBusiness;
    private final HealthConditionBusiness healthConditionBusiness;

    public UserController(UserBusiness userBusiness, UserFamilyBusiness userFamilyBusiness,
                          SicknessBusiness sicknessBusiness, HealthConditionBusiness healthConditionBusiness) {
        this.userBusiness = userBusiness;
        this.userFamilyBusiness = userFamilyBusiness;
        this.sicknessBusiness = sicknessBusiness;
        this.healthConditionBusiness = healthConditionBusiness;
    }

    @GetMapping("/find/by/email/{email}")
    public Object findUserByEmail(@PathVariable("email") String email){
        return this.userBusiness.findByEmail(email);
    }

    @PostMapping("/save")
    public Object saveUser(@RequestBody UserDto user){
        return this.userBusiness.save(user);
    }

    @PostMapping("/login")
    public Object login(@RequestBody UserCredentialsDto userCredentials){
        return this.userBusiness.login(userCredentials);
    }

    @PostMapping("/family/save")
    public Object saveUser(@RequestBody UserFamilyDto userFamilyDto){
        return this.userFamilyBusiness.save(userFamilyDto);
    }

    @GetMapping("/family/find/by/email/{email}")
    public Object findByEmail(@PathVariable("email") String email){
        return this.userFamilyBusiness.findAllByUser_Email(email);
    }

    @PostMapping("/health/condition/save")
    public Object saveHealthCondition(@RequestBody HealthConditionRequestDto healthConditionRequestDto){
        return this.healthConditionBusiness.save(healthConditionRequestDto);
    }

    @GetMapping("/sickness/find/all")
    public Object findAllSickness(){
        return this.sicknessBusiness.findAll();
    }

}
