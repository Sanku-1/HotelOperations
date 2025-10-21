package com.pluralsight;

public class HotelOperations {
    public static void main(String[] args) {

        Room newRoom = new Room(3, 50);
        System.out.println(newRoom.isAvailable());
        newRoom.checkIn();
        System.out.println(newRoom.isAvailable());
        newRoom.checkOut();
        System.out.println(newRoom.isAvailable());
        newRoom.cleanRoom();
        System.out.println(newRoom.isAvailable());

        Employee testEmp = new Employee("1234", "John", "Housekeeping", 25, 0);
//        testEmp.punchTimeClock(12.30);
//        System.out.println(testEmp.getHoursWorked());
//        testEmp.punchTimeClock(14.30);
//        System.out.println(testEmp.getHoursWorked());
//        testEmp.punchTimeClock(12.30);
//        System.out.println(testEmp.getHoursWorked());
//        testEmp.punchTimeClock(14.30);
        System.out.println(testEmp.getHoursWorked());
        testEmp.punchTimeClock(10.30);
        System.out.println(testEmp.getHoursWorked());
        testEmp.punchTimeClock(14.30);
        System.out.println(testEmp.getHoursWorked());
        testEmp.punchTimeClock();
        System.out.println(testEmp.getHoursWorked());
        testEmp.punchTimeClock();
        System.out.println(testEmp.getHoursWorked());

    }
}
