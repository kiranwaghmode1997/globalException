package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.globalException.NotEligibleForVoteException;
import com.example.demo.globalException.NotEmptyNameException;

@RestController
public class DemoController {

	@PostMapping("/hello")
	public String hello(@RequestBody Student std) throws NotEmptyNameException {

		if(std.getName().isEmpty()) {
			throw new NotEmptyNameException("Name must not be empity");
		}
		if(std.getAge()<18) {
			throw new NotEligibleForVoteException("not elidgibe");
		}
		
		return "success";
	}

}
