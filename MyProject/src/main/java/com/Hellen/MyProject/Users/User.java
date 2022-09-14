package com.Hellen.MyProject.Users;

import java.util.Objects;

public class User {

	private String userId;
	private String username;
	private String email;
	private String password;
	private String givenName;
	private String surname;
	private boolean isActive;
	private Role role;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
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
	
	public String getGivenName() {
		return givenName;
	}
	
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public boolean getIsActive() {
		return isActive;
	}
	
	public void setIs_active(boolean is_active) {
		this.isActive = is_active;
	}
	
	public Role getRole() {
		return role;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return Objects.equals(userId, user.userId) && Objects.equals(username, user.username) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(givenName, user.givenName) && Objects.equals(surname, user.surname) && Objects.equals(isActive, user.isActive) && Objects.equals(role, user.role);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(userId, username, email, password,givenName, surname, isActive, role);
	}
	
	@Override
	public String toString() {
		return "User {" +
	           "userId='" + userId + '\'' +
	           ", username='" + username + '\'' +
	           ", email='" + email + '\'' +
	           ", password='" + password + '\'' +
	           ", givenName='" + givenName + '\'' +
	           ", surname='" + surname + '\'' +
	           ", isActive='" + isActive + '\'' +
	           ", role='" + role + '\'' +
	           '}';
	}
}

