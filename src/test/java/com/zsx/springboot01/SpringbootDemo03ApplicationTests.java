package com.zsx.springboot01;

import com.zsx.springboot01.Service.EmployeesService;
import com.zsx.springboot01.mapper.EmployeeMapper;
import com.zsx.springboot01.pojo.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootDemo03ApplicationTests {

    @Autowired
    EmployeesService employeesService;

    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    void contextLoads() {
        List<Employee> employees = employeeMapper.queryAllEmployee();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}
