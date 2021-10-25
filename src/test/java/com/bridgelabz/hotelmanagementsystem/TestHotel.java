package com.bridgelabz.hotelmanagementsystem;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Ability to add Hotel in a Hotel Reservation System with Name and rates for Regular Customer...
 */

public class TestHotel {
    public static HotelReservation hotelReservation;

    @BeforeClass
    public static void setUp() {
        hotelReservation = new HotelReservation();
    }

    @Test
    public void add_hotel_detail() {
        HotelDetail hotelDetail = new HotelDetail();

        hotelDetail.defineRate(CustomerType.REGULAR, new Rate(90, 110));
        hotelDetail.defineRate(CustomerType.REWARD, new Rate(80, 80));
        hotelReservation.addHotelDetails("Lakewood", hotelDetail);

        hotelDetail.defineRate(CustomerType.REGULAR, new Rate(110, 160));
        hotelDetail.defineRate(CustomerType.REWARD, new Rate(60, 50));
        hotelReservation.addHotelDetails("Bridgewood", hotelDetail);

        hotelDetail.defineRate(CustomerType.REGULAR, new Rate(150, 220));
        hotelDetail.defineRate(CustomerType.REWARD, new Rate(40, 100));
        hotelReservation.addHotelDetails("Ridgewood", hotelDetail);

        Assert.assertEquals(3, hotelReservation.hotels.size());
    }
}
