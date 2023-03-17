package com.bridgelabz;

import java.util.ArrayList;

public class Company {
	String name;
	ArrayList<Employee> employees;

	public Company(String name) {
		this.name = name;
		employees = new ArrayList<>();
	}

	public void addEmployee(Employee employee){

		employees.add(employee);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Company{" +
				"name='" + name + '\'' +
				", employees=" + employees +
				'}';
	}
}
