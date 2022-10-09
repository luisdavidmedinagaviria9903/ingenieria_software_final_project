package com.ingenieria.software.demo.service.impl;

import com.ingenieria.software.demo.domain.User;
import com.ingenieria.software.demo.repository.UserRepository;
import com.ingenieria.software.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    @Override
    @Transactional
    public User save(User user) {
        return this.userRepository.saveAndFlush(user);
    }
}
