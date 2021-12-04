package com.prashanth.bikeRental.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "bike")
@DynamicInsert
@DynamicUpdate
public class Bike
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "type")
    private final String type;

    @Column(name = "needservice")
    private final String needservice;

    private Bike(final BikeBuilder bikeBuilder)
    {
        this.type = bikeBuilder.type;
        this.needservice = bikeBuilder.needservice;
    }

    public int getId()
    {
        return id;
    }

    public String getType()
    {
        return type;
    }

    public String getNeedservice()
    {
        return needservice;
    }

    public static BikeBuilder Builder(final String type)
    {
        return new BikeBuilder(type);
    }

    public static class BikeBuilder
    {
        private final String type;
        private String needservice;

        private BikeBuilder(final String type)
        {
            this.type = type;
        }

        public BikeBuilder needservice(final String needservice)
        {
            this.needservice = needservice;
            return this;
        }

        public Bike build()
        {
            return new Bike(this);
        }
    }
}
