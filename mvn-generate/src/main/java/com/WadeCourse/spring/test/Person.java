package com.WadeCourse.spring.test;

public class Person {
	
	private int id;
	private String name;
	private int testId;
	private Address address;//will demo dependency injection
  public void setTestId(int testId) {
		this.testId = testId;
	}
public Person(){
	  
  }	
public static Person getInstance(int id, String name){
	System.out.println("instance");
	return new Person(id, name);
}
  public Person(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", testId=" + testId + ", address=" + address + "]";
}
public void Speak(){
    System.out.println("Hello world , I'm a pserson");  
  }
  
}