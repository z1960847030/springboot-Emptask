package com.zsx.springboot01.mapper;

import com.zsx.springboot01.pojo.Department;
import com.zsx.springboot01.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {
    //增加员工
    int addEmployee(Employee employee);

    //删除员工
    int deleteEmployeeById(int id);

    //更改员工信息
    int updateEmployee(Employee employee);

    //根据ID查询员工
    Employee queryEmployeeById(int id);

    //查询所有员工
    List<Employee> queryAllEmployee();

    List<Department> queryAllByDepartment();

}
