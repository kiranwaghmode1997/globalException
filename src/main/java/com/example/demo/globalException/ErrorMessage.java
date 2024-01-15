package com.example.demo.globalException;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessage {


	private HttpStatus status;
	private String msg;
}
