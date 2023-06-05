package com.example.springboot.mybatis.myBatistest.dao;

import com.example.springboot.mybatis.myBatistest.model.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Select("select * from employees")
    List<Employee> getAll();

    @Insert("insert into employees(first_name, last_name, email_address) values (#{firstName}, #{lastName}, #{emailAddress})")
    int insertData(Employee employee);
}
