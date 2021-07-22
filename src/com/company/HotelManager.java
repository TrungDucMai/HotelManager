package com.company;

import java.util.ArrayList;
import java.util.List;

public class HotelManager {
    List<Hotel> guestList = new ArrayList<>();
    private String managerName;

    public HotelManager() {
    }

    public HotelManager(List<Hotel> guestList, String managerName) {
        this.guestList = guestList;
        this.managerName = managerName;
    }

    public List<Hotel> getGuestList() {
        return guestList;
    }

    public void setGuestList(List<Hotel> guestList) {
        this.guestList = guestList;
    }

    public String getManagerName() {
        return managerName;
    }



    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public void editGuestInfo(int index, Hotel guest) {
        guestList.set(index, guest);
    }

    public void removeGuest(Hotel guest) {
        guestList.remove(guest);
    }

    public void addGuest(Hotel guest) {
        guestList.add(guest);
    }

    public void newGuest (double staytime, String roomstype, double roomprice, String name, String birth, String id){
        Hotel guest = new Guest(staytime, roomstype,roomprice,name,birth,id);
        guestList.add(guest);
    }
    public void showAll() {
        for (int i = 0; i < guestList.size(); i++) {
            System.out.println("Guest : "+ getGuestList().get(i));
        }
    }




    public void checkOut(String guestId) {
        for (int i = 0; i < guestList.size(); i++) {
            double payment = 0;
            if (((Guest) guestList.get(i)).getId().equals(guestId)) {
                payment = guestList.get(i).getRoomPrice() * getGuestList().get(i).getStayTime();
                System.out.println("Payment : " + payment);
                break;
            } else {
                System.out.println("Can find guest info");
            }
        }
    }
}