package com.aurora.tcab_backend.model.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Document("employee_details")
@Data
public class Employee {
    @Id
    @Field("employee_id")
    private String id;
    @Field("employee_name")
    private String name;
    @Field("email")
    private String email;
    @Field("phone")
    private Long phone;
    @Field("route")
    private String route;
    @Field("pickUp")
    private String pickUp;
    @Field("dropOff")
    private String dropOff;
}
