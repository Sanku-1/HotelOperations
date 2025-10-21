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
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
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
            if (numberOfRooms <= this.getAvailableSuites()) {
                this.bookedSuites += numberOfRooms;
                booked = true;
            } else {
                System.out.println("Unfortunately there aren't enough available rooms for your request");
            }
        } else {
            if (numberOfRooms <= this.getAvailableRooms()) {
                this.bookedBasicRooms += numberOfRooms;
                booked = true;
            } else {
                System.out.println("Unfortunately there aren't enough available rooms for your request");
            }
        }
        return booked;
    }

    public int getAvailableSuites() {
        return (this.numberOfSuites - this.bookedSuites);
    }

    public int getAvailableRooms() {
        return (this.numberOfRooms - this.bookedBasicRooms);
    }
}