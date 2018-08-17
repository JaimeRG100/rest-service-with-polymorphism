package com.jimbo.restdemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
	
	private PersonName personName;
	
	private String Medicallicense;

}
