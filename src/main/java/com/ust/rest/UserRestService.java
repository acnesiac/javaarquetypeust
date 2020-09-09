package com.ust.rest;

import com.ust.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/public/rest/user")
public class UserRestService {

    @Autowired
    private UserRepository repository;

    @RequestMapping(value = "/showForm")
	public String showForm(@RequestParam String hola) {
        return "Hello world" + hola;
    }
}
