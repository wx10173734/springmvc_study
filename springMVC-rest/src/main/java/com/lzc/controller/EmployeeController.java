package com.lzc.controller;

import com.lzc.bean.Employee;
import com.lzc.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @title: EmployeeController
 * @Author luozouchen
 * @Date: 2022/11/27 20:20
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/employee")
    public String getUser(Model model) {
        Collection<Employee> employeeList = employeeDao.getAll();
        model.addAttribute("employeeList", employeeList);
        return "employee_list";
    }

    @DeleteMapping("/employee/{id}")
    private String deleteEmployee(@PathVariable("id") Integer id) {
        employeeDao.delete(id);
        return "redirect:/employee";
    }

    @PostMapping("/employee")
    public String addEmployee(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/employee";

    }

    @GetMapping("/employee/{id}")
    public String getEmployeeById(@PathVariable("id") Integer id, Model model) {
        Employee employee = employeeDao.get(id);
        model.addAttribute("employee", employee);
        return "employee_update";
    }

    @PutMapping("/employee")
    public String updateEmployee(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/employee";

    }

}
