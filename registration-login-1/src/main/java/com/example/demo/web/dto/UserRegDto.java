package com.example.demo.web.dto;

public class UserRegDto {
	private String FirstName;
	private String LastName;
	private String email;
	private String password;

	public UserRegDto() {
	}

	public UserRegDto(String firstName, String lastName, String email, String password) {
		super();
		FirstName = firstName;
		LastName = lastName;
		this.email = email;
		this.password = password;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
