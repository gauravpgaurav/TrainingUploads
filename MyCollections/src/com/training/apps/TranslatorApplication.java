package com.training.apps;

import com.training.maps.TranslateService;

public class TranslatorApplication {

	public static void main(String[] args) {

		TranslateService translateIns = new TranslateService();
		
		System.out.println(translateIns.findEngWord("ek"));
		
		translateIns.printWords();
		
		System.out.println("\nJava 8 -");
		translateIns.printWordsJ8();
		
	}

}
