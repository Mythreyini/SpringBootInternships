package com.example.SpringBotApp.repository;

import com.example.SpringBotApp.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeModel,Integer> {
}
