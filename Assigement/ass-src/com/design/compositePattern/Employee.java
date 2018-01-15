package com.design.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private String dept;
	private int salary;

	private List<Employee> subordiantes;

	public Employee(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordiantes = new ArrayList<>();
	}

	public void add(Employee e) {
		subordiantes.add(e);
	}

	public void remove(Employee e) {
		subordiantes.remove(e);
	}

	public List<Employee> getSubordinates() {
		return subordiantes;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + ","

				+ "]";
	}

}
