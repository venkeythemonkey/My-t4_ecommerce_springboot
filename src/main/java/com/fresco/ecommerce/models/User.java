package com.fresco.ecommerce.models;

import java.util.Set;

import javax.persistence.Entity;

@Entity
public class User {
	private Integer userId;
	private String username;
	private String password;

	// Implement Roles
	private Set<Object> roles;

	public User() {
		super();
	}

	public User(String username, String password, Set<Object> roles) {
		super();
		this.username = username;
		this.password = password;
		this.roles = roles;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Object> getRoles() {
		return roles;
	}

	public void setRoles(Set<Object> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", roles=" + roles
				+ "]";
	}

}
