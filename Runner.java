package com.infosys.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Person n1 = new Person();
			n1.name = "Matt";
			n1.age = 20;
			n1.JobTitle = "Software developer";
			System.out.println(n1.showName());
			System.out.println(n1.showAge());
			System.out.println(n1.showJobTitle());

			Person n2 = new Person();
			n2.name = "Haazim";
			n2.age = 20;
			n2.JobTitle = "Footballer";
			System.out.println(n2.showName());
			System.out.println(n2.showAge());
			System.out.println(n2.showJobTitle());

			Person n3 = new Person("Jhon", 20, "Teacher");

//			ArrayList<Person> perlist = new ArrayList<Person>();
			
			personmanager pm1 = new personmanager();
			
			pm1.perlist.addAll(Arrays.asList(n1, n2, n3));
			System.out.print(pm1.perlist);
			System.out.println("----------------");
			System.out.println("----------------");
	pm1.method("Jhon");
			  
		}
		

	}
}