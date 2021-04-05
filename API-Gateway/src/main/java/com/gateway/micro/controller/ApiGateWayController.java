package com.gateway.micro.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.gateway.micro.dto.Admin;
import com.gateway.micro.dto.Users;


@RestController
@RequestMapping(value="/api")
public class ApiGateWayController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/getUser")
	public List<Object> getUser() {
		String url="http://USER-SERVICE/user/getAllUsers";
		   Object[] objects= restTemplate.getForObject(url, Object[].class);
		   return Arrays.asList(objects);
		}
	
	@GetMapping("/getAdmin")
	public List<Object> getAdmin() {
		String url="http://ADMIN-SERVICE/admin/getAllAdmin";
		   Object[] objects= restTemplate.getForObject(url, Object[].class);
		   return Arrays.asList(objects);
		}
	
	@PostMapping("/saveUser")
	public Users saveUser(@RequestBody Users user) {
		String url="http://USER-SERVICE/user/saveUser";
		Users req = restTemplate.postForObject(url, user, Users.class);
		   return req;
		}
	
	@PostMapping("/saveAdmin")
	public Admin saveAdmin(@RequestBody Admin admin) {
		String url="http://ADMIN-SERVICE/admin/saveAdmin";
		Admin req = restTemplate.postForObject(url, admin, Admin.class);
		   return req;
		}
	
	
}
