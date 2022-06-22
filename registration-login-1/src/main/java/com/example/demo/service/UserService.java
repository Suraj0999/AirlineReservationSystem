package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.web.dto.UserRegDto;

public interface UserService {

	User save(UserRegDto regDto);

}
