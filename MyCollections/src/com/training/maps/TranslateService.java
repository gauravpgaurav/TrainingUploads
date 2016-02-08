package com.training.maps;

import java.util.*;

public class TranslateService {

	private Hashtable<String, String> hindiToEnglish;

	public TranslateService() {

		super();
		hindiToEnglish = new Hashtable<String, String>();
		init();
	}

	public void init() {

		hindiToEnglish.put("ek", "One");
		hindiToEnglish.put("kela", "Banana");
		hindiToEnglish.put("chaawal", "Rice");

	}

	public String findEngWord(String hindiWord) {
		return hindiToEnglish.get(hindiWord);
	}

	public void printWords() {
		Set<Map.Entry<String, String>> list = hindiToEnglish.entrySet();
		System.out.println("\nAll Words");
		for (Map.Entry<String, String> words : list) {
			System.out.println(words.getKey() + "\t:=\t" + words.getValue());
		}
	}
}
