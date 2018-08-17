package com.jimbo.restdemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllResponse {
	
	private Doctor doctor;
	
	private Person person;
	
	private String idRequest;
	

}
