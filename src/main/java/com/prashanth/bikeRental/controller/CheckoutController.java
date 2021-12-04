package com.prashanth.bikeRental.controller;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prashanth.bikeRental.model.Checkout;
import com.prashanth.bikeRental.service.CheckoutService;

@RestController
@RequestMapping("/checkout")
public class CheckoutController
{
    @Autowired
    CheckoutService checkoutService;

    @PostMapping("/{userId}/{bikeId}")
    public Checkout bikeCheckout(@PathVariable("userId") final Integer userId, @PathVariable("bikeId") final Integer bikeId)
    {
        final Timestamp checkoutDate = new Timestamp(new Date().getTime());
        final Checkout co = checkoutService.bikeCheckout(userId, bikeId, checkoutDate);
        return co;
    }
}
