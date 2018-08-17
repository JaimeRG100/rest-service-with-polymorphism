package com.jimbo.restdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jimbo.restdemo.domain.AllResponse;
import com.jimbo.restdemo.domain.Doctor;
import com.jimbo.restdemo.domain.Person;
import com.jimbo.restdemo.domain.PersonName;

@RestController
@RequestMapping("/rest")
public class MyRestController {
	
	@GetMapping("/")
	public AllResponse home() {
		
		PersonName p1 = new com.jimbo.restdemo.domain.phi.PersonName("Jose", "Suarez","Jr");
		Person person = new Person(p1, "01289127187");
		
		PersonName p2 = new PersonName("Pedro", "Perez", "Lic");
		Doctor doctor = new Doctor(p2, "1919-112-1212");
		
		return new AllResponse(doctor, person, "1");
		
	}
	


}
