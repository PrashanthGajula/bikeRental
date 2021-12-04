package com.prashanth.bikeRental.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "checkout")
@DynamicInsert
@DynamicUpdate
public class Checkout
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "userid")
    private final int userId;

    @Column(name = "bikeid")
    private final int bikeId;

    @Column(name = "checkoutdate")
    private final Date checkoutDate;

    @Column(name = "returndate")
    private final Date returnDate;

    @Column(name = "pricecharged")
    private final int priceCharged;

    @Column(name = "isactive")
    private final String isActive;

    public int getId()
    {
        return id;
    }

    public int getUserId()
    {
        return userId;
    }

    public int getBikeId()
    {
        return bikeId;
    }

    public Date getCheckoutDate()
    {
        return checkoutDate;
    }

    public Date getReturnDate()
    {
        return returnDate;
    }

    public int getPriceCharged()
    {
        return priceCharged;
    }

    public String getIsActive()
    {
        return isActive;
    }

    public Checkout(final CheckoutBuilder checkoutBuilder)
    {
        this.userId = checkoutBuilder.userId;
        this.bikeId = checkoutBuilder.bikeId;
        this.checkoutDate = checkoutBuilder.checkoutDate;
        this.returnDate = checkoutBuilder.returnDate;
        this.priceCharged = checkoutBuilder.priceCharged;
        this.isActive = checkoutBuilder.isActive;
    }

    public static CheckoutBuilder Builder(final int userId, final int bikeId)
    {
        return new CheckoutBuilder(userId, bikeId);
    }

    public static class CheckoutBuilder
    {
        private final int userId;
        private final int bikeId;
        private Date checkoutDate;
        private Date returnDate;
        private int priceCharged;
        private String isActive;

        private CheckoutBuilder(final int userId, final int bikeId)
        {
            this.userId = userId;
            this.bikeId = bikeId;
        }

        public CheckoutBuilder checkoutDate(final Date checkoutDate)
        {
            this.checkoutDate = checkoutDate;
            return this;
        }

        public CheckoutBuilder returnDate(final Date returnDate)
        {
            this.returnDate = returnDate;
            return this;
        }

        public CheckoutBuilder priceCharged(final int priceCharged)
        {
            this.priceCharged = priceCharged;
            return this;
        }

        public CheckoutBuilder isActive(final String isActive)
        {
            this.isActive = isActive;
            return this;
        }

        public Checkout build()
        {
            return new Checkout(this);
        }
    }
}
