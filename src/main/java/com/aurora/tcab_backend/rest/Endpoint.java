package com.aurora.tcab_backend.rest;

import com.aurora.tcab_backend.model.user.Employee;
import com.aurora.tcab_backend.repository.user.UserRepository;
import com.aurora.tcab_backend.services.EmployeeServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoint {
	@Autowired
	UserRepository userDetailRepo;

    @Autowired
    EmployeeServices services;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/createUser")
    @ResponseBody
    void createUser(@RequestBody Employee user){
        System.out.println("Data creation started...");
        System.out.println(user.getName());
        services.registerUser(user);
		System.out.println("Data creation complete...");
    }

    @GetMapping("/findUserByName/{name}")
    @ResponseBody
    void findUserByName(@PathVariable String name){
        Employee user = userDetailRepo.findUserByName(name);
        System.out.println(user.getName());
    }

    @GetMapping("/getUserByName")
    @ResponseBody
    void getUserByName(@RequestParam String name){
        Employee user = userDetailRepo.findUserByName(name);
        System.out.println(user.getName());
    }
}
