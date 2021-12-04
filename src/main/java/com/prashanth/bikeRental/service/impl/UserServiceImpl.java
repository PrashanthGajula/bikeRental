package com.prashanth.bikeRental.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.prashanth.bikeRental.model.User;
import com.prashanth.bikeRental.service.UserService;

@Service
public class UserServiceImpl implements UserService
{

    @Override
    public List<User> getAllUsers()
    {
        final User u1 = User.Builder("Prashanth", 4691112233L).email("pg@gmail.com").isAdmin("true").build();
        final User u2 = User.Builder("Hari", 9032223344L).email("hh@gmail.com").isAdmin("false").build();

        return Arrays.asList(u1, u2);
    }

    @Override
    public List<User> getCheckedoutUers()
    {
        final User u1 = User.Builder("Sashank", 4691112233L).email("pg@gmail.com").isAdmin("true").build();
        final User u2 = User.Builder("Anurag", 9032223344L).email("hh@gmail.com").isAdmin("false").build();

        return Arrays.asList(u1, u2);
    }

    @Override
    public User getUserById(final Integer id)
    {
        return User.Builder("Sashank", 4691112233L).email("pg@gmail.com").isAdmin("true").build();
    }

    @Override
    public User addUser(final User user)
    {
        return User.Builder(user.getName(), user.getPhone()).email(user.getEmail()).isAdmin(user.getIsAdmin()).build();
    }

}
