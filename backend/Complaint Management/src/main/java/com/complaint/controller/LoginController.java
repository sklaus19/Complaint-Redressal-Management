package com.complaint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.complaint.dto.UserDto;
import com.complaint.entity.User;
import com.complaint.service.UserService;


@RestController
@CrossOrigin
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/check")
	public User loginHandler(@RequestBody UserDto userDto) {
		System.out.println(userDto.getEmail());
		System.out.println(userService.loginCheck(userDto).getEmail());
		return userService.loginCheck(userDto);
	}

}
