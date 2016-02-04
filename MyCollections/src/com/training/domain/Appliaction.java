package com.training.domain;

public class Appliaction {

	public static void main(String[] args){
		
		NursingHome nursingIns = new NursingHome();
		
		Doctor doc1 = new Doctor(107, "Ramesh", "Anaesthesia");
		Doctor doc2 = new Doctor(102, "Suresh", "Oncology");
		Doctor doc3 = new Doctor(100, "Cadbury", "ENT");
		
		nursingIns.addDoctor(doc1);
		nursingIns.addDoctor(doc2);
		nursingIns.addDoctor(doc3);
		
		System.out.println("Unsorted List :");
		nursingIns.printDoctorList();
		System.out.println("\nSorted List :");
		nursingIns.printSortedDoctorList();
	}
}
