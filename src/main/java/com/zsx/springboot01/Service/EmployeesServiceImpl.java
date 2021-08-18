package com.zsx.springboot01.Service;

import com.zsx.springboot01.mapper.EmployeeMapper;
import com.zsx.springboot01.pojo.Department;
import com.zsx.springboot01.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesServiceImpl implements EmployeesService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> queryAllEmployee() {
        return employeeMapper.queryAllEmployee();
    }

    @Override
    public List<Department> queryAllByDepartment() {
        return employeeMapper.queryAllByDepartment();
    }

    //增加员工
    @Override
    public int addEmployee(Employee employee) {
        return employeeMapper.addEmployee(employee);
    }

    @Override
    public int deleteEmployeeById(int id) {
        return employeeMapper.deleteEmployeeById(id);
    }

    @Override
    public int updateEmployee(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }

    @Override
    public Employee queryEmployeeById(int id) {
        return employeeMapper.queryEmployeeById(id);
    }
}
