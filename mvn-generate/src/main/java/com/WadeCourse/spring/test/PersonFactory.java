package com.WadeCourse.spring.test;

public class PersonFactory {
//	private static Person createPerson(int id, String name){
	private Person createPerson(int id, String name){
		System.out.println("Using Factory to create person");
		return new Person(id, name);
	}
}
