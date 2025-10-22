package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void  checkIn_EmptyCleanRoom_OccupiedAndDirtyRoom() {
        //Arrange
        Room testRoom0 = new Room(3, 50);
        boolean expectedCleanlinessState = true;
        boolean expectedOccupiedState = true;

        //Act
        testRoom0.checkIn();

        //Assert
        boolean testOccupied = testRoom0.isOccupied;
        boolean testDirty = testRoom0.isDirty;
        assertEquals(expectedCleanlinessState, testDirty);
        assertEquals(expectedOccupiedState, testOccupied);
    }

    @Test
    public void  checkOut_OccupiedAndDirtyRoom_UnoccupiedAndDirtyRoom() {
        //Arrange
        Room testRoom1 = new Room(3, 50);
        boolean expectedCleanlinessState = true;
        boolean expectedOccupiedState = false;

        //Act
        testRoom1.checkIn();
        testRoom1.checkOut();

        //Assert
        boolean testOccupied = testRoom1.isOccupied;
        boolean testDirty = testRoom1.isDirty;
        assertEquals(expectedCleanlinessState, testDirty);
        assertEquals(expectedOccupiedState, testOccupied);
    }

    @Test
    public void  cleanRoom_UnoccupiedAndDirtyRoom_UnoccupiedAndCleanRoom() {
        //Arrange
        Room testRoom2 = new Room(3, 50);
        boolean expectedCleanlinessState = false;
        boolean expectedOccupiedState = false;

        //Act
        testRoom2.checkIn();
        testRoom2.checkOut();
        testRoom2.cleanRoom();

        //Assert
        boolean testOccupied = testRoom2.isOccupied;
        boolean testDirty = testRoom2.isDirty;
        assertEquals(expectedCleanlinessState, testDirty);
        assertEquals(expectedOccupiedState, testOccupied);
    }

}