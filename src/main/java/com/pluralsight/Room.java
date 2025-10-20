package com.pluralsight;

public class Room {
    int numberOfBeds;
    double price;
    boolean isOccupied;
    boolean isDirty;
    boolean isAvailable;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = (!this.isDirty && !this.isOccupied);
    }

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
        return isAvailable;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}

