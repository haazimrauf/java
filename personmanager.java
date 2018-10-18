package com.infosys.oop;

import java.util.ArrayList;

public class personmanager {

	ArrayList<Person> perlist = new ArrayList<Person>();
	
	// mthod that searches for person
	
	public void method(String name) {
//		perlist.stream().filter(name -> "Haazim".equals(perlist.getName("Haazim")));
		
		
		
		perlist.stream().filter(p -> p.showName().equals(name)).forEach(System.out::println);
		
	}
	
	
}
