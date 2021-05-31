package com.example.beans;

import org.springframework.boot.autoconfigure.domain.EntityScan;


import org.springframework.stereotype.Component;
//import lombok.*;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor

public class Employee {
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	private int id;
	private String name;
	private String department;
	private int salary;
}
