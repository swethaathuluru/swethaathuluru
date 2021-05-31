package com.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beans.Employee;
import com.example.dao.EmployeeRdo;
import com.example.exception.CustomException;

@Service
public class EmployeeService implements IEmployeeService {
	@Autowired
	private EmployeeRdo rdo;

	public Employee addEmployee(Employee employee)throws CustomException{
	
			EmployeeRdo rdo = new EmployeeRdo();
			rdo.addEmployee(employee);
		
	return employee;
}
	public List<Employee> displayEmployee()  {
		// EmployeeRdo rdo = new EmployeeRdo();
		List<Employee> list = new ArrayList<Employee>();

		list = rdo.displayEmployee();

		return list;
	}

	public Boolean update(Employee employee,int id) throws CustomException {
		//EmployeeRdo rdo = new EmployeeRdo();
		rdo.update(employee,id);
		return true;

	}

	public Boolean delete(int id) throws CustomException {
		//EmployeeRdo rdo = new EmployeeRdo();
		rdo.delete(id);
		return true;
	}

	public List<Employee> search(int id) throws CustomException {
		List<Employee> list = new ArrayList<Employee>();
		//EmployeeRdo rdo = new EmployeeRdo();
		return list = rdo.search(id);
	}

}
