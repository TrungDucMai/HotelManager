package com.company;

public class Hotel  {
    private double stayTime;
    private String roomStyle;
    private double roomPrice;

   public Hotel(){};


    public Hotel(double stayTime, String roomStyle, double roomPrice) {
        this.stayTime = stayTime;
        this.roomStyle = roomStyle;
        this.roomPrice = roomPrice;
    }



    public double getStayTime() {
        return stayTime;
    }

    public void setStayTime(double stayTime) {
        this.stayTime = stayTime;
    }

    public String getRoomStyle() {
        return roomStyle;
    }

    public void setRoomStyle(String roomStyle) {
        this.roomStyle = roomStyle;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                super.toString()+
                "stayTime=" + stayTime +
                ", roomStyle='" + roomStyle + '\'' +
                ", roomPrice='" + roomPrice + '\'' +
                '}';
    }
}
