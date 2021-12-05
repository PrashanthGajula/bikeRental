package com.prashanth.bikeRental.service;

import java.util.List;
import java.util.Optional;

import com.prashanth.bikeRental.model.User;

public interface UserService
{
    public List<User> getAllUsers();

    public List<User> getCheckedoutUers();

    public Optional<User> getUserById(Integer id);

    public User addUser(User user);
}
