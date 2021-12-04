package com.prashanth.bikeRental.service.impl;

import java.sql.Timestamp;

import org.springframework.stereotype.Service;

import com.prashanth.bikeRental.model.Checkout;
import com.prashanth.bikeRental.service.CheckoutService;

@Service
public class CheckoutServiceImpl implements CheckoutService
{
    @Override
    public Checkout bikeCheckout(final Integer userId, final Integer bikeId, final Timestamp checkoutDate)
    {
        final Checkout co = Checkout.Builder(userId, bikeId).checkoutDate(checkoutDate).returnDate(checkoutDate).priceCharged(10).isActive("true")
                .build();
        return co;
    }
}
