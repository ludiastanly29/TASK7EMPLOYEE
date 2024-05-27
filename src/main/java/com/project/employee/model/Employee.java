package com.project.employee.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "employeeDetails")
public class Employee {
    @Id
    private String id;
    private String employeeID;
    private String name;
    private String email;
    private String location;
}
