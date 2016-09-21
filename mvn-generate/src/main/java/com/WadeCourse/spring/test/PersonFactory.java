package com.WadeCourse.spring.test;

public class PersonFactory {
	private static Person getInstance(int id, String name){
		return new Person(id, name);
	}
}
