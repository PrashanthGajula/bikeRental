package com.prashanth.bikeRental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prashanth.bikeRental.model.Bike;
import com.prashanth.bikeRental.model.rest.RESTBike;
import com.prashanth.bikeRental.service.BikeService;

@RestController
@RequestMapping("/bike")
public class BikeController
{
    @Autowired
    BikeService bikeService;

    @GetMapping("/allBikes")
    public List<Bike> getAllBikes()
    {
        return bikeService.getAllBikes();
    }

    @GetMapping("/getAvailableBikes")
    public List<Bike> getBikesToCheckout()
    {
        return bikeService.getBikesToCheckout();
    }

    // PUT: http://localhost:8080/bike/serviceBike/11
    @PutMapping("/serviceBike/{id}")
    public Bike serviceBike(@PathVariable("id") final Integer id)
    {
        return bikeService.serviceBike(id);
    }

    /**
     * URL: PUT: http://localhost:8080/bike/updateBikeType/11 <br>
     * Body: { "type": "Small", "needservice": "yes" }
     */
    @PutMapping("/updateBikeType/{id}")
    public Bike updateBikeType(@PathVariable("id") final Integer id, @RequestBody final RESTBike restBike)
    {
        final Bike b1 = Bike.Builder(restBike.getType()).needservice(restBike.getNeedservice()).build();
        return bikeService.updateBikeType(id, b1);
    }

    @PostMapping("/addBike")
    public Bike addBike(@RequestBody final RESTBike restBike)
    {
        final Bike bike = Bike.Builder(restBike.getType()).needservice(restBike.getNeedservice()).build();
        return bikeService.addBike(bike);
    }

    // http://localhost:8080/bike/bikesByUser/Prashanth
    @GetMapping("/bikesByUser/{name:[a-zA-Z]*}")
    public List<Bike> getBikesByUser(@PathVariable("name") final String name)
    {
        return bikeService.getBikesByUser(name);
    }

    @GetMapping("/bikesToService")
    public List<Bike> getBikesToService()
    {
        return bikeService.getBikesToService();
    }
}
