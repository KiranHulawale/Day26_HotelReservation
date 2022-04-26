package com.bridgelabz;

public class HotelReservationMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System");
        HotelReservationSystem hotelReservation = new HotelReservationSystem();
        hotelReservation.addHotelDetails("Lakewood", 110, 80, 90, 80, 3);
        hotelReservation.addHotelDetails("Bridgewood", 160, 110, 60, 50, 4);
        hotelReservation.addHotelDetails("Ridgewood", 220, 110, 150, 40, 5);
       // hotelReservation.getHotelDetails();
        System.out.println("Cheapest hotel is :");
        hotelReservation.viewHotels();
       // hotelReservation.getCheapestHotel();
    }
}
