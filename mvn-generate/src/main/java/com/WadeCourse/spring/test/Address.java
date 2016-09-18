package com.WadeCourse.spring.test;

public class Address {
	private String street;
	private String postcode;
	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode + "]";
	}
	public Address(){
		
	}
	public Address(String street, String postcode) {
		super();
		this.street = street;
		this.postcode = postcode;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	
}
