package com.bridgelabz.hotelmanagementsystem;
import java.util.HashMap;

public class HotelReservation {

    public HashMap<String, HotelDetail> hotels = new HashMap<>();

    public void addHotelDetails(String hotelName, HotelDetail hotelDetail) {
        hotels.put(hotelName, hotelDetail);
    }
}
