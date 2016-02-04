package com.training.apps;

import java.util.*;

import com.training.domain.Doctor;
import com.training.domain.NursingHome;
import com.training.domain.Patient;

public class Application {

	public static void main(String[] args){
		
		NursingHome nursingIns = new NursingHome();
		
		Doctor doc1 = new Doctor(101, "Ramesh", "Anaesthesia");
		Doctor doc2 = new Doctor(102, "Suresh", "Oncology");
		Doctor doc3 = new Doctor(103, "Cadbury", "ENT");
		
		nursingIns.addDoctor(doc1);
		nursingIns.addDoctor(doc2);
		nursingIns.addDoctor(doc3);
		
		Patient pat1 = new Patient(901, "Gaurav", 9822822);
		Patient pat2 = new Patient(902, "Saurav", 9782410);
		Patient pat3 = new Patient(903, "Alfred", 9982321);

		TreeSet<Patient> patients = new TreeSet<Patient>();
		
		//HashSet is not ordered in any way - comparable/comparator not required
		//HashSet<Patient> patients = new HashSet<Patient>();
		
		patients.add(pat1);
		patients.add(pat2);
		patients.add(pat3);
		doc1.setPatients(patients);
		
		System.out.println("Unsorted List :");
		nursingIns.printDoctorList();
		
		Scanner sc = new Scanner(System.in);
		int opt = 0;
		
		while(opt!=4){
			
		for(int k=0;k<30;k++)
			System.out.print("---");
		System.out.println("\nChoose Option : -");
		System.out.println("1. ID");
		System.out.println("2. Name");
		System.out.println("3. Specialization");
		System.out.println("4. Exit");
		System.out.print("\nEnter:\t");
		opt = sc.nextInt();
		
		if(opt==4)
			break;
		
		System.out.println("\nSorted List :");
		nursingIns.printSortedDoctorList(opt);
		
		}
		System.out.println("\nExited !");
		sc.close();
	}
}
