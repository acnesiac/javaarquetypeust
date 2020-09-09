package com.ust.service;

import java.util.Optional;

import com.ust.model.User;

public interface UserService {

    Optional<User> getUserByLoginName(String loginName);

    User findById(Long id);

}