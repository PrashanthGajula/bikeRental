package com.prashanth.bikeRental.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.prashanth.bikeRental.model.Bike;

@Service
public class BikeServiceImpl implements BikeService
{
    @Override
    public List<Bike> getAllBikes()
    {
        final Bike b1 = Bike.Builder("Small").needservice("no").build();
        final Bike b2 = Bike.Builder("Medium").needservice("no").build();

        return Arrays.asList(b1, b2);
    }

    @Override
    public List<Bike> getBikesToCheckout()
    {
        final Bike b1 = Bike.Builder("Small").needservice("no").build();
        return Arrays.asList(b1);
    }

    @Override
    public Bike serviceBike(final Integer id)
    {
        final Bike b1 = Bike.Builder("Small").needservice("yes").build();
        return b1;
    }

    @Override
    public Bike updateBikeType(final Integer id, final Bike bike)
    {
        final Bike b1 = Bike.Builder("EV").needservice("no").build();
        return b1;
    }

    @Override
    public Bike addBike(final Bike bike)
    {
        return bike;
    }

    @Override
    public List<Bike> getBikesByUser(final String name)
    {
        final Bike b1 = Bike.Builder("EV").needservice("no").build();
        return Arrays.asList(b1);
    }

    @Override
    public List<Bike> getBikesToService()
    {
        final Bike b1 = Bike.Builder("Small").needservice("yes").build();
        final Bike b2 = Bike.Builder("Medium").needservice("yes").build();

        return Arrays.asList(b1, b2);
    }
}
