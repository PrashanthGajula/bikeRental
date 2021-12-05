package com.prashanth.bikeRental.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prashanth.bikeRental.model.User;
import com.prashanth.bikeRental.model.rest.RESTUser;
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

    // http://localhost:8080/user/getUser/12
    @GetMapping(value = "getUser/{id}")
    public User getUserById(@PathVariable("id") final Integer id) throws Exception
    {
		Optional<User> user = userService.getUserById(id);
		if(!user.isPresent()) {
			throw new Exception("could not find a user with id :"+id);
		}
		return user.get();
    }

    // http://localhost:8080/user/getUser?id=2
    //@GetMapping(value = "getUser")
    //public User getUsersById(@RequestParam("id") final Integer id)
    //{
    //    return userService.getUserById(id);
    //}

    @PostMapping("/addUser")
    public User addUser(@RequestBody final RESTUser restUser)
    {
        final User user = User.Builder(restUser.getName(), restUser.getPhone()).email(restUser.getEmail()).isAdmin(restUser.getIsAdmin()).build();
        return userService.addUser(user);
    }
}
