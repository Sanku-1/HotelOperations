package com.pluralsight;

public class Reservation {
    String roomType;
    double price;
    int numberOfNights;
    boolean isWeekend;
    double reservationTotal;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        if (this.roomType.equalsIgnoreCase("king")) {
            this.price = 139.00;
        } else if (this.roomType.equalsIgnoreCase("double")){
            this.price = 124.00;
        }
        if (this.isWeekend) {
            this.price = this.price * 1.1;
        }
    }


    public String getRoomType() {
        return roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public double getReservationTotal() {
        reservationTotal = this.price * this.numberOfNights;
        return reservationTotal;
    }

    public double getPrice() {
        return price;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
}


