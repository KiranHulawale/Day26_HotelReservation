package com.bridgelabz;

public class Hotel {
    private String hotelName;
    private String WeekDayRegularRate;
    private String WeekDayRewardRate;
    private String WeekEndRegularRate;
    private String WeekEndRewardRate;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getWeekDayRegularRate() {
        return WeekDayRegularRate;
    }

    public void setWeekDayRegularRate(String wDayRegularRate) {
        this.WeekDayRegularRate = wDayRegularRate;
    }

    public String getWeekDayRewardRate() {
        return WeekDayRewardRate;
    }

    public void setWeekDayRewardRate(String wDayRewardRate) {
        this.WeekDayRewardRate = wDayRewardRate;
    }

    public String getWeekEndRegularRate() {
        return WeekEndRegularRate;
    }

    public void setWeekEndRegularRate(String wEndRegularRate) {
        this.WeekEndRegularRate = wEndRegularRate;
    }

    public String getWeekEndRewardRate() {
        return WeekEndRewardRate;
    }

    public void setWeekEndRewardRate(String wEndRewardRate) {
        this.WeekEndRewardRate = wEndRewardRate;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", WeekDayRegularRate='" + WeekDayRegularRate + '\'' +
                ", WeekDayRewardRate='" + WeekDayRewardRate + '\'' +
                ", WeekEndRegularRate='" + WeekEndRegularRate + '\'' +
                ", WeekEndRewardRate='" + WeekEndRewardRate + '\'' +
                '}';
    }
}
