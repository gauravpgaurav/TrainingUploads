package com.training.app;

import java.util.*;

import com.training.domain.Employee;
import com.training.domain.Manager;
import com.training.maps.ManagerEmployeeMap;

public class ManagerEmpApplication {

	public static void main(String[] args) {

		Employee[] empArray1 = new Employee[3];
		Employee[] empArray2 = new Employee[3];

		empArray1[0] = new Employee("101", "Gaurav", "Intern", 15000);
		empArray1[1] = new Employee("102", "Saurav", "Designer", 45000);
		empArray1[2] = new Employee("103", "Kaurav", "Trainer", 30000);

		empArray2[0] = new Employee("105", "ABC", "Intern", 15000);
		empArray2[1] = new Employee("106", "XYZ", "Designer", 45000);
		empArray2[2] = new Employee("107", "PQR", "Trainer", 30000);

		List<Employee> empList1 = new ArrayList<Employee>();
		List<Employee> empList2 = new ArrayList<Employee>();

		for (Employee tempEmp : empArray1) {
			empList1.add(tempEmp);
		}

		for (Employee tempEmp : empArray2) {
			empList2.add(tempEmp);
		}

		Manager man1 = new Manager("500", "Ramesh", "Manager", 85000);
		Manager man2 = new Manager("1000", "Suresh", "Manager", 95000);

		ManagerEmployeeMap mapIns1 = new ManagerEmployeeMap(man1.getEmployeeId(), empList1);
		ManagerEmployeeMap mapIns2 = new ManagerEmployeeMap(man2.getEmployeeId(), empList2);

		mapIns1.printAllManagerEmployees();
		mapIns2.printAllManagerEmployees();
	}
}
