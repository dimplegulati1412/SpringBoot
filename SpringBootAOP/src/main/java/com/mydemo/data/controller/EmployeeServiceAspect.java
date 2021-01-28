package com.mydemo.data.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;  
import org.aspectj.lang.annotation.Before;  
import org.springframework.stereotype.Component;  
@Aspect  
@Component  
public class EmployeeServiceAspect   
{  
//	http://localhost:8080/addEmployee
	/*@After
	@AfterReturning-whenever ur method is returning something.
	@AfterThrowing.*///this advice will be called whenver a method is throwing some exceptions.
	//joinpoint is a class which is containing all information about the method.
@Before(value= "execution(* EmployeeService.*(..)) and args(empId, fname, sname)")  
public void beforeAdvice(JoinPoint joinPoint, String empId, String fname, String sname) {  
System.out.println("Before method:" + joinPoint.getSignature());  
System.out.println("Creating Employee with first name - " + fname + ", second name - " + sname + " and id - " + empId);  
} 
@After(value = "execution(* EmployeeService.*(..)) and args(empId, fname, sname)")  
public void afterAdvice(JoinPoint joinPoint, String empId, String fname, String sname) {  
System.out.println("After method:" + joinPoint.getSignature());  
System.out.println("Creating Employee with first name - " + fname + ", second name - " + sname + " and id - " + empId);  
}  
}  


