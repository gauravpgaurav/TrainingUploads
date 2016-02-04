package com.training.domain;

import java.util.*;

import com.training.utils.MyComparators;

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
		
		//Ascend
		//Collections.sort(doctorList);
		
		//Descend
		Collections.sort(doctorList, Collections.reverseOrder());
		
		// Reusing Print Function - I am the OOP Programmer
		printDoctorList();
		
	}
	
	public void printSortedList(int i){
		
		MyComparators comp = new MyComparators();
		
		switch(i){
		
		case 1: printSortedDoctorList();
				break;
		
		case 2: 
				MyComparators.NameComparator comp1 = comp.new NameComparator();
				Collections.sort(doctorList,comp1);
				printDoctorList();
				break;
				
		case 3:		
				MyComparators.SpecializationComparator comp2 = comp.new SpecializationComparator();
				Collections.sort(doctorList,comp2);
				printDoctorList();
				break;
				
		default:
					break;
					
		}
	}
}
