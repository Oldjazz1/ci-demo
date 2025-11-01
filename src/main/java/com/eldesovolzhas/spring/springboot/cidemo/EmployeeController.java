package com.eldesovolzhas.spring.springboot.cidemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return List.of(
                new Employee(1L, "Antonio Petuchini", "Backend Developer"),
                new Employee(2L, "Olzhas Yeldessov", "Frontend Developer"),
                new Employee(3L, "Jane Doe", "Frontend Developer")
        );
    }
}
