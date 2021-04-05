package com.gateway.micro.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {

	private String employeeId;
	
	private String name;
	
	private String surname;
	
	private String email;
	
	private String password;
	
	private String role;
	
	private String designation;
	
	private String city;
	
	private Integer contact;
	
}
