package com.tbp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tbp.crud.entity.User;
import com.tbp.crud.service.UserService;

@RestController
public class UserController {
 
	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user)
	{
		userService.createUser(user);
		return userService.createUser(user);
	}
	
	@PostMapping("/addUsers")
	public List<User>addUsers(@RequestBody List<User> users)
	{
		return userService.createUsers(users);
	}
	
	@GetMapping("/user/{id}")
	public User getuserById(@PathVariable int id)
	{
		return userService.getUserById(id);
	}
	@GetMapping("/users")
	public List<User> getAllUsers()
	{
		return userService.getUsers();
	}
	@GetMapping("/Updateuser")
	public User updateUser(@RequestBody User user)
	{
		return userService.updateUser(user);
	}
	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable int id)
	{
		return userService.deleteUserById(id);
	}
}
