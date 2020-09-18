package com.coppel.usuario.security.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.coppel.usuario.security.SecurityUtils;
import com.coppel.usuario.security.model.User;
import com.coppel.usuario.security.repository.UserRepository;

import java.util.Optional;

@Service
@Transactional
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional(readOnly = true)
    public Optional<User> getUserWithAuthorities() {
        return SecurityUtils.getCurrentUsername().flatMap(userRepository::findOneWithAuthoritiesByUsername);
    }

}
