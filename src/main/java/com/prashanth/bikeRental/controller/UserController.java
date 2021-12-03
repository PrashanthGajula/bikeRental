package com.prashanth.bikeRental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prashanth.bikeRental.model.User;
import com.prashanth.bikeRental.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    UserService userService;

    @GetMapping("/allUsers")
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @GetMapping("/checkedoutUsers")
    public List<User> getCheckedoutUsers()
    {
        return userService.getCheckedoutUers();
    }

    @GetMapping(value = "getUser/{id}")
    public User getUserById(@PathVariable(value = "id") final Integer id)
    {
        return userService.getUserById(id);
    }

}
