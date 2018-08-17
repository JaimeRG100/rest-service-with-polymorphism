package com.jimbo.restdemo.domain.phi;

public class PersonName extends com.jimbo.restdemo.domain.PersonName {
	
	public PersonName() {
	}

	public PersonName(String firstName, String lastName, String title) {
		super(firstName, lastName, title);
	}

	public String getFirstName() {
		return mask(super.getFirstName());
	}
	
	public String getLastName() {
		return mask(super.getLastName());
	}
	
	public static String mask(String text) {
	 return text.replaceAll(".(?=.{3})", "*");
	}
	
	
	
	
}
