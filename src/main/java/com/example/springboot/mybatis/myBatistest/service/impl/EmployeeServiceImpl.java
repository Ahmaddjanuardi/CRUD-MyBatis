package com.example.springboot.mybatis.myBatistest.service.impl;

import com.example.springboot.mybatis.myBatistest.dao.EmployeeMapper;
import com.example.springboot.mybatis.myBatistest.model.Employee;
import com.example.springboot.mybatis.myBatistest.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List getAll() {
        return employeeMapper.getAll();
    }

    @Override
    public int insert(Employee employee) {
        return employeeMapper.insertData(employee);
    }
}
