package com.bridgelabz.hotelmanagementsystem;
import java.util.HashMap;

/**
 * Using HashMap to associate a key with Value pair.
 * Make the constructor to access the class level variable
 * Then initialize the map so that we can update the new data.
 *
 */

public class HotelDetail {
    public HashMap<CustomerType, Rate> hotelRate;

    public HotelDetail() {
        this.hotelRate = new HashMap<>();
    }

    public void defineRate(CustomerType customerType, Rate rate) {
        hotelRate.put(customerType, rate);
    }
}

