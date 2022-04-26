package com.bridgelabz;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class HotelReservationSystem {
    List<Hotel> hotelDetails = new ArrayList<>();
    public void addHotelDetails(String hotelName, int weekdayRateForRegular, int weekendRateForRegular, int weekdayRateForRewarder, int weekendRateForRewarder) {
        Hotel hotel= new Hotel(hotelName, weekdayRateForRegular, weekendRateForRegular, weekdayRateForRewarder, weekendRateForRewarder);
        hotelDetails.add(hotel);
    }
    public void getHotelDetails(){
        System.out.println(hotelDetails);
    }
    public boolean checkHotelDetails(Hotel hotel) {
        return hotelDetails.add(hotel);
    }
}

