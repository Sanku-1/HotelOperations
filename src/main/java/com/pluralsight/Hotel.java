package com.pluralsight;

public class Hotel {
    String name;
    int numberOfSuites;
    int numberOfRooms;
    int bookedSuites;
    int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        boolean booked = false;
        if (isSuite) {
            if (numberOfRooms <= (this.numberOfSuites - this.bookedSuites)) {
                this.bookedSuites += numberOfRooms;
                booked = true;
            } else {
                System.out.println("Unfortunately there aren't enough available rooms for your request");
            }
        } else {
            if (numberOfRooms <= (this.numberOfRooms - this.bookedBasicRooms)) {
                this.bookedBasicRooms += numberOfRooms;
                booked = true;
            } else {
                System.out.println("Unfortunately there aren't enough available rooms for your request");
            }
        }
        return booked;
    }
}