package com.training.maps;

import java.util.*;

import com.training.domain.Employee;

public class ManagerEmployeeMap {

	private Hashtable<String, List<Employee>> managerEmpMap;
	private String managerId;

	public ManagerEmployeeMap() {
		super();
		managerEmpMap = new Hashtable<String, List<Employee>>();
	}

	public ManagerEmployeeMap(String managerId, List<Employee> empList) {
		super();
		this.managerId = managerId;
		managerEmpMap = new Hashtable<String, List<Employee>>();
		managerEmpMap.put(managerId, empList);
	}

	public void printAllManagerEmployees() {

		Set<Map.Entry<String, List<Employee>>> list = managerEmpMap.entrySet();

		for (Map.Entry<String, List<Employee>> words : list) {

			System.out.println("\n Employees Under ManagerId : " + managerId);
			for (Employee tempEmp : words.getValue()) {
				System.out.println("\t"+tempEmp);
			}

		}
	}

}
