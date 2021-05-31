package com.example.services;

import java.util.List;

import com.example.beans.Employee;
import com.example.exception.CustomException;



public interface IEmployeeService {
	public Employee addEmployee(Employee employee) throws CustomException;
	 
	 public List<Employee> displayEmployee() ;
	 
	public Boolean update(Employee employee,int id) throws CustomException ;
	
	public Boolean delete(int id) throws CustomException ;
	
	public  List<Employee> search(int id) throws CustomException ;
}
