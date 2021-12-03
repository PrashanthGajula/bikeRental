package com.prashanth.bikeRental.service;

import java.util.List;

import com.prashanth.bikeRental.model.Bike;

public interface BikeService
{
    public List<Bike> getAllBikes();

    public List<Bike> getBikesToCheckout();

    public Bike serviceBike(Integer id);

    public Bike updateBikeType(Integer id, Bike bike);

    public Bike addBike(Bike bike);

    public List<Bike> getBikesByUser(String name);

    public List<Bike> getBikesToService();
}
