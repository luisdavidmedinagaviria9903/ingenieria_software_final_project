package com.ingenieria.software.demo.service;

import com.ingenieria.software.demo.domain.User;

public interface UserService {

    User findByEmail(String email);
    User save(User user);
}
