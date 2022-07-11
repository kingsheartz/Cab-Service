package com.aurora.tcab_backend.services;

import com.aurora.tcab_backend.model.user.Employee;
import com.aurora.tcab_backend.repository.user.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.aurora.tcab_backend.services"})
public class EmployeeServices {
    
	@Autowired
	UserRepository userDetailRepo;
    
    public void registerUser(Employee employee){
        userDetailRepo.save(employee);
    }
}
