package com.prashanth.bikeRental.service;

import java.util.List;

import com.prashanth.bikeRental.model.User;

public interface UserService
{
    public List<User> getAllUsers();

    public List<User> getCheckedoutUers();

    public User getUserById(Integer id);
}
