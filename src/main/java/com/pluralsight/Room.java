package com.pluralsight;

public class Room {
    int numberOfBeds;
    double price;
    boolean isOccupied;
    boolean isDirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;}

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied() && !isDirty();
    }

    public void setOccupied(boolean occupied) {
        this.isOccupied = occupied;
    }

    public void checkIn() {
        this.isOccupied = true;
        this.isDirty = true;
    }

    public void checkOut() {
        this.isOccupied = false;
    }

    public void cleanRoom() {
        this.isDirty = false;
    }
}

