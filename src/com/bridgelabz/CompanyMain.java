package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;

public class CompanyMain {
	public static void main(String[] args) {
		Company company1 = new Company("Bridgelabz");
		Company company2 = new Company("Infosys");

		Employee employee1 = new Employee("Anjali Rawke",22,70581688,"Nanded","Maharashtra","Electronics");
		Employee employee2 = new Employee("Apeksha Patil",23,90114224,"latur","Maharashtra","Computer Science");
		Employee employee3 = new Employee("Pranjali Rawke",27,82751365,"Pune","Maharashtra","IT");
		Employee employee4 = new Employee("Mayur Kulkarni",30,75432821,"Pune","Maharashtra","Civil");

		company1.addEmployee(employee1);
		company1.addEmployee(employee2);
		company2.addEmployee(employee3);
		company2.addEmployee(employee4);

		Map<String,Company> companyMap = new HashMap<>();
		companyMap.put(company1.getName(),company1);
		companyMap.put(company2.getName(),company2);

		for(Map.Entry companyName : companyMap.entrySet()){
			System.out.println(companyName.getKey() + " " + companyName.getValue());
//			Company company = companyMap.get(companyName);
//			System.out.println("Company Name: " + company.getName() + " \nEmployees: " );
//			for (Employee employee : company.getEmployees()){
//				System.out.println( "Name: " + employee.getName() + " Age: " + employee.getAge() + " PhoneNumber: " + employee.getPhoneNumber() + " City: " + employee.getCity() + "State: " + employee.getState() + " Department: " + employee.getDepartment());
//			}
		}
	}
}
