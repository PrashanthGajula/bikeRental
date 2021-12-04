package com.prashanth.bikeRental.model.rest;

public class RESTCheckout
{
    private int userId;
    private int bikeId;
    private int priceCharged;
    private String isActive;

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(final int userId)
    {
        this.userId = userId;
    }

    public int getBikeId()
    {
        return bikeId;
    }

    public void setBikeId(final int bikeId)
    {
        this.bikeId = bikeId;
    }

    public int getPriceCharged()
    {
        return priceCharged;
    }

    public void setPriceCharged(final int priceCharged)
    {
        this.priceCharged = priceCharged;
    }

    public String getIsActive()
    {
        return isActive;
    }

    public void setIsActive(final String isActive)
    {
        this.isActive = isActive;
    }
}
