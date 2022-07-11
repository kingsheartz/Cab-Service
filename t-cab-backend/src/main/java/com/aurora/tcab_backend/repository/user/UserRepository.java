package com.aurora.tcab_backend.repository.user;

import java.util.List;

import com.aurora.tcab_backend.model.user.Employee;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<Employee, String>{
    @Query("{name:'?0'}")
    Employee findUserByName(String name);
    
    public long count();
}
