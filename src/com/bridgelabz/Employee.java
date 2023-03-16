package com.bridgelabz;

public class Employee {
	String name;
	int age;
	int phoneNumber;
	String city;
	String state;
	String department;

	public Employee(String name, int age, int phoneNumber, String city, String state, String department) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.state = state;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
