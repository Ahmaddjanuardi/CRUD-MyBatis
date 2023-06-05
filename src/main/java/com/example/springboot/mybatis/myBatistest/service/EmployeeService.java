package com.example.springboot.mybatis.myBatistest.service;


import com.example.springboot.mybatis.myBatistest.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAll();

    int insert(Employee employee);


}
