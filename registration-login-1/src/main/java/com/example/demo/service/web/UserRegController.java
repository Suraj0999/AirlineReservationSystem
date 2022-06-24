package com.example.demo.service.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.UserService;
import com.example.demo.web.dto.UserRegDto;

@Controller
@RequestMapping("/registration")

public class UserRegController {
	private UserService userService;

	public UserRegController(UserService userService) {
		super();
		this.userService = userService;
	}

	public String RegisterUserAccount(@ModelAttribute("user") UserRegDto regDto) {
		userService.save(regDto);
		return "redirected:/registration?success";
	}

}
