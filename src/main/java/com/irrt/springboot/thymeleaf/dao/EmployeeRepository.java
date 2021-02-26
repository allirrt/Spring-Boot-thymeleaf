package com.irrt.springboot.thymeleaf.dao;

import com.irrt.springboot.thymeleaf.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // no need to write any code !

}
