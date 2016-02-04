package com.training.apps;

import java.util.Scanner;

import com.training.domain.Doctor;
import com.training.domain.NursingHome;

public class Application {

	public static void main(String[] args){
		
		NursingHome nursingIns = new NursingHome();
		
		Doctor doc1 = new Doctor(101, "Ramesh", "Anaesthesia");
		Doctor doc2 = new Doctor(102, "Suresh", "Oncology");
		Doctor doc3 = new Doctor(103, "Cadbury", "ENT");
		
		nursingIns.addDoctor(doc1);
		nursingIns.addDoctor(doc2);
		nursingIns.addDoctor(doc3);
		
		System.out.println("Unsorted List :");
		nursingIns.printDoctorList();
		
		Scanner sc = new Scanner(System.in);
		int opt = 0;
		
		while(opt!=4){
			
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
