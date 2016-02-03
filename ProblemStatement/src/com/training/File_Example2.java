package com.training;

import java.io.*;

public class File_Example2 {
	public static void main(String[] args){
		
	File dir = new File(".");
	//String[] files = dir.list();
	File[] fileList = dir.listFiles();
	
	for(File fileIns : fileList)
	{
		if(fileIns.isDirectory())
			{
				System.out.println("\t\t Directory : "+fileIns);	
				String[] fileList2 = fileIns.list();
				
				for(String fileIns2 : fileList2)
				
					System.out.println("\t\t\t\t"+fileIns2+"\n");
				
			}
		
		else
			
			System.out.println(fileIns);
		
	}	
 }
}
