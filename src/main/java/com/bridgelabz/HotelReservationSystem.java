package com.bridgelabz;
import java.util.*;

public class HotelReservationSystem {

    private static final Scanner scanner = new Scanner(System.in);
    private static List<Hotel> hotelsList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to hotel reservation system");
        HotelReservationSystem hotelReservationMain = new HotelReservationSystem();
        boolean exit = false;
        do {
            System.out.println("\tWelcome To Hotel Reservation\n");
            System.out.println("\tEnter A to Add Hotel\n");
            System.out.print("\tPlease Select One Option :\n ");
            char userInput = scanner.nextLine().toUpperCase().charAt(0);
            switch (userInput) {
                case 'A':
                    //add
                    hotelReservationMain.addHotel();
                    break;
                case 'Q':
                    //quit
                    exit = true;
                    break;
                default:
                    System.out.println("Please select correct option");
            }
        } while (!exit);
    }
    public boolean addHotel(){
        Hotel hotel = new Hotel();
        try {
            System.out.print("Enter Hotel Name : ");
            hotel.setHotelName(scanner.nextLine());
            System.out.print("Enter Weekdays Regular Rate : ");
            hotel.setWeekDayRegularRate(scanner.nextLine());
            System.out.print("Enter Weekdays Reward Rate : ");
            hotel.setWeekDayRewardRate(scanner.nextLine());
            System.out.print("Enter Weekend Regular Rate : ");
            hotel.setWeekEndRegularRate(scanner.nextLine());
            System.out.print("Enter Weekend Reward Rate : ");
            hotel.setWeekEndRewardRate(scanner.nextLine());
            hotelsList.add(hotel);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

}

