package com.example.demo.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;
import com.example.demo.web.dto.UserRegDto;

@Service
public class UserServiceImplemens implements UserService {
	@Autowired
	private UserRepo userRepo;

	public UserServiceImplemens(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}

	@Override
	public User save(UserRegDto regDto) {
		User user = new User(regDto.getFirstName(), regDto.getLastName(), regDto.getEmail(), regDto.getPassword(),
				Arrays.asList(new Role("ROLE_USER")));

		return userRepo.save(user);
	}

}
