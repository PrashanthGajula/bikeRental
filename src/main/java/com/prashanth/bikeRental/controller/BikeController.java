package com.prashanth.bikeRental.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bike")
public class BikeController
{
    @GetMapping("/getAllBikes")
    public List<String> getAllBikes()
    {
        return Arrays.asList("bike1", "bike2", "bike3");
    }
}
