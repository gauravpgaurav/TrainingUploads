package com.training.domain;

import java.util.*;

public class NursingHome {

	// Creating Type Safe Ordered Collection
	
	private ArrayList<Doctor> doctorList;

	public NursingHome() {
		
		doctorList = new ArrayList<Doctor>();
	}
	
	public boolean addDoctor(Doctor doc){
		
		boolean result = doctorList.add(doc);
		
		return result;
	}
	
	public void printDoctorList(){
		
		for(Doctor doc : doctorList){
			System.out.println(doc);
		}
	}
	
	public void printSortedDoctorList(){
		
		Collections.sort(doctorList);
		printDoctorList();
		
	}
}
