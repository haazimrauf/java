package com.infosys.oop;

public class Person {

	public String name;
	public int age;
	public String JobTitle;
	
	public Person() {
		super();
	}

	public Person(String name1, int age1, String JobTitle1) {
		name= name1;
		age= age1;
		JobTitle= JobTitle1;
		System.out.println(name);
		System.out.println(age);
		System.out.println(JobTitle);

	}

	public String showName() {
		return name;
	}

	public int showAge() {
		return age;
	}

	public String showJobTitle() {
		return JobTitle;
		}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This name: " + name + " This age: " + age +" + This Jobtitle " + JobTitle;
	}
	
}
