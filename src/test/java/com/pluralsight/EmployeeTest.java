package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void  punchIn_EmployeeNotPunchedIn_PunchInTimeEqualsParameterInput() {
        //Arrange
        Employee testEmployee0 = new Employee("1234", "John Doe", "Valet" ,25, 10);
        double expectedPunchInTime = 12.30;

        //Act
        testEmployee0.punchIn(12.30);

        //Assert
        double testPunchInTime = testEmployee0.getStartTime();
        assertEquals(expectedPunchInTime, testPunchInTime);
    }

    @Test
    public void  punchOut_EmployeePunchedIn_HoursWorkedIncreased() {
        //Arrange
        Employee testEmployee0 = new Employee("1234", "John Doe", "Valet" ,25, 0);
        double expectedHoursWorked = 2.0;

        //Act
        testEmployee0.punchIn(12.30);
        testEmployee0.punchOut(14.30);

        //Assert
        double testHoursWorked = testEmployee0.getHoursWorked();
        assertEquals(expectedHoursWorked, testHoursWorked);
    }


}