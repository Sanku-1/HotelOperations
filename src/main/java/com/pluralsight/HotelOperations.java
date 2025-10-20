package com.pluralsight;

public class HotelOperations {
    public static void main(String[] args) {

        Room newRoom = new Room(3, 50, false, false);

        newRoom.setOccupied(true);
        System.out.println(newRoom.isAvailable);
    }
}
