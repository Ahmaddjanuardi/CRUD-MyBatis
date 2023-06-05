package com.example.springboot.mybatis.myBatistest.controller;

import com.example.springboot.mybatis.myBatistest.model.Employee;
import com.example.springboot.mybatis.myBatistest.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getAll")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }

    @PostMapping("/insertData")
    public int insertData(@RequestBody Employee employee)
    {return employeeService.insert(employee);}
}
