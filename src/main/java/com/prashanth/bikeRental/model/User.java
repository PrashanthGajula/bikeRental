package com.prashanth.bikeRental.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

// @Component
@Entity
@Table(name = "user")
@DynamicInsert
@DynamicUpdate
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private long phone;

    @Column(name = "email")
    private String email;

    @Column(name = "isadmin")
    private String isAdmin;
 
    private User(){}
    
    private User(final UserBuilder builder)
    {
        this.name = builder.name;
        this.phone = builder.phone;
        this.email = builder.email;
        this.isAdmin = builder.isAdmin;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public long getPhone()
    {
        return phone;
    }

    public String getEmail()
    {
        return email;
    }

    public String getIsAdmin()
    {
        return isAdmin;
    }

    public static UserBuilder Builder(final String name, final long phone)
    {
        return new UserBuilder(name, phone);
    }

    public static class UserBuilder
    {
        private final String name;
        private final long phone;
        private String email;
        private String isAdmin;

        private UserBuilder(final String name, final long phone)
        {
            this.name = name;
            this.phone = phone;
        }

        /*
         * public Builder name(final String name) { this.name = name; return this; } public Builder phone(final int phone) { this.phone = phone;
         * return this; }
         */

        public UserBuilder email(final String email)
        {
            this.email = email;
            return this;
        }

        public UserBuilder isAdmin(final String isAdmin)
        {
            this.isAdmin = isAdmin;
            return this;
        }

        public User build()
        {
            return new User(this);
        }
    }
}
