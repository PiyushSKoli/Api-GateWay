package com.gateway.micro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

	private String id;
	
	private String name;
	
	private String surname;
	
	private String email;
	
	private String password;
	
	private String role;
	
}
