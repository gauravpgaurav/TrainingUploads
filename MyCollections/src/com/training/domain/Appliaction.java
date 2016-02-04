package com.training.domain;

public class Appliaction {

	public static void main(String[] args){
		
		NursingHome nursingIns = new NursingHome();
		
		Doctor doc1 = new Doctor(101, "Ramesh", "Anaesthesia");
		Doctor doc2 = new Doctor(102, "Suresh", "Oncology");
		Doctor doc3 = new Doctor(103, "Cadbury", "ENT");
		
		nursingIns.addDoctor(doc1);
		nursingIns.addDoctor(doc2);
		nursingIns.addDoctor(doc3);
		
		nursingIns.printDoctorList();
	}
}
