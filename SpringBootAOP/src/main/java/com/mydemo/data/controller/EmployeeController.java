package com.mydemo.data.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RequestParam;  
import org.springframework.web.bind.annotation.RestController;

import com.mydemo.data.model.Employee;  

@RestController  
public class EmployeeController   
{  
@Autowired  
private EmployeeService employeeService; 
//http://localhost:8080/add/employee?empId=1&firstName=abc&secondName=sdfdsf;
@GetMapping(value = "/add/employee")  
public Employee addEmployee(@RequestParam("empId") String id, 
		@RequestParam("firstName") String fName,
		@RequestParam("secondName") String sName)   
{  
return employeeService.createEmployee(id, fName, sName);  
}  
@GetMapping(value = "/remove/employee") 
public String removeEmployee( @RequestParam("empId") String empId)   
{  
employeeService.deleteEmployee(empId);  
return "Employee removed";  
}  
}  
