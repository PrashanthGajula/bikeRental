package com.prashanth.bikeRental.service;

import java.sql.Timestamp;

import com.prashanth.bikeRental.model.Checkout;

public interface CheckoutService
{
    Checkout bikeCheckout(Integer userId, Integer bikeId, Timestamp checkoutDate);
}
