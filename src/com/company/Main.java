package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("nhap so khach can them : ");
        Scanner scanner = new Scanner(System.in);
//        Hotel guest1 = new Guest(5, "Suite", 500, "Trung", "6/11/1996", "123456");
//        Hotel guest2 = new Guest(3, "Single", 100, "Binh", "11/6/1996", "680295");
//        Hotel guest3 = new Guest(15, "Double", 200, "Than", "7/5/1998", "682547");
//        Hotel guest4 = new Guest(6, "Single", 100, "Van", "2/4/1992", "1098395");


        HotelManager trung = new HotelManager();
        List<Hotel> guest = new ArrayList<>();
        trung.setGuestList(guest);
        System.out.println("Nhap so khach can them : ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {

            System.out.println("Enter guest's infos here : ");

            System.out.println("Enter name : ");
            String name = scanner.nextLine();
              scanner.nextLine();
            System.out.println("Enter guest's birth : ");
            String birth = scanner.nextLine();
              scanner.nextLine();
            System.out.println("Enter guest's id : ");
            String id = scanner.nextLine();
             scanner.nextLine();
            System.out.println("Enter guest's stay time : ");
            double staytime = scanner.nextDouble();

            System.out.println(" Enter guest's room stype : ");
            scanner.nextLine();
            String roomstype = scanner.nextLine();
           scanner.nextLine();
            System.out.println(" Enter guest's room price : ");
            double roomprice = scanner.nextDouble();

            trung.newGuest(staytime, roomstype, roomprice, name, birth, id);

        }

        trung.showAll();
        System.out.println("Check out: Guest's Id :");
        String f = scanner.nextLine();
        String id = scanner.nextLine();
        trung.checkOut(id);


    }


}
