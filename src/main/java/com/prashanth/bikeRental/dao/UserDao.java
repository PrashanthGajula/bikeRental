package com.prashanth.bikeRental.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prashanth.bikeRental.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

}
