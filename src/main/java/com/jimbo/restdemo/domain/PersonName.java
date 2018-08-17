package com.jimbo.restdemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonName {

	private String firstName;
	
	private String lastName;
	
	private String title;
	
}
