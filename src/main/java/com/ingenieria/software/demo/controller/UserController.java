package com.ingenieria.software.demo.controller;

import com.ingenieria.software.demo.business.UserBusiness;
import com.ingenieria.software.demo.dto.UserCredentialsDto;
import com.ingenieria.software.demo.dto.UserDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(allowedHeaders = "*")
public class UserController {

    private final UserBusiness userBusiness;

    public UserController(UserBusiness userBusiness) {
        this.userBusiness = userBusiness;
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
}
