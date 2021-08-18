package com.zsx.springboot01.controller;

import com.zsx.springboot01.Service.EmployeesService;
import com.zsx.springboot01.mapper.EmployeeMapper;
import com.zsx.springboot01.pojo.Department;
import com.zsx.springboot01.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeesController {

    @Autowired
    private EmployeesService employeesService;

    @Autowired
    private EmployeeMapper employeeMapper;

    //查询员工列表
    @RequestMapping("/employeesList")
    public String employeesList(Model model){
        List<Employee> employees = employeeMapper.queryAllEmployee();
        model.addAttribute("employees",employees);
        return "/emp/list";
    }


    //跳转到增加员工界面
    @GetMapping("/toAddEmpPage")
    public String toAddEmp(Model model){
        List<Department> departments = employeesService.queryAllByDepartment();
        model.addAttribute("departments",departments);
        return "/emp/toAddEmp";
    }

    //增加员工
    @PostMapping("/addEmployee")
    public String addEmployee(Employee employee) throws SQLException {
        employeesService.addEmployee(employee);
        return "redirect:/employeesList";
    }

    //删除员工
    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable("id") int id, Model model){
        employeesService.deleteEmployeeById(id);
        return "redirect:/employeesList";
    }

    //跳转到更改员工信息界面
    @GetMapping("/toUpdateEmployeePage/{id}")
    public String toUpdateEmployee(@PathVariable("id") int id,Model model){
        List<Department> departments = employeesService.queryAllByDepartment();
        Employee employee = employeesService.queryEmployeeById(id);
        model.addAttribute("departments",departments);
        model.addAttribute("employee",employee);
        return "/emp/toUpdateEmp";
    }

    //更改员工信息
    @PostMapping("/updateEmployee")
    public String updateEmployee(Employee employee){
        employeesService.updateEmployee(employee);
        return "redirect:/employeesList";
    }
}
