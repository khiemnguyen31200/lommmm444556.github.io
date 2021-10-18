package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.demo.repository.EmployeeDao;

@Configuration
public class RepoConfig {

    @Bean
    public EmployeeDao employeeDao() {
        return new EmployeeDao("employee.csv");
    }
}
