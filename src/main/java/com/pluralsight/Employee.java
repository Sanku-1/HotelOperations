package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    String employeeId;
    String name;
    String department;
    double payRate;
    double hoursWorked;
    double totalPay;
    double regularHours;
    double overtimeHours;
    double punchInTime;
    double punchOutTime;
    LocalDateTime punchInLocalDateTime;
    LocalDateTime punchOutLocalDateTime;


    Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getOvertimeHours() {
        if (this.hoursWorked > 40) {
            this.overtimeHours = this.hoursWorked - 40;
        } else {
            this.overtimeHours = 0;
        }
        return this.overtimeHours;
    }

    public double getTotalPay() {
        totalPay = this.getRegularHours() * this.payRate + this.getOvertimeHours() * this.payRate * 1.5;
        return this.totalPay;
    }

    public double getRegularHours() {
        if (this.hoursWorked > 40) {
            this.regularHours = 40;
        }
        return this.regularHours;
    }

    public void punchTimeClock(double time) {
        double hoursWorkedThisShift = 0;
        if (this.punchInTime == 0) {
            this.punchInTime = time;
        } else {
            this.punchOutTime = time;
            hoursWorkedThisShift = this.punchOutTime - this.punchInTime;
            this.hoursWorked += hoursWorkedThisShift;
            this.punchInTime = 0;
            this.punchOutTime = 0;
        }
    }

    public void punchTimeClock() {
        if (this.punchInLocalDateTime == null) {
            this.punchInLocalDateTime = LocalDateTime.now();
        } else {
            this.punchInLocalDateTime = LocalDateTime.now();
            double punchInHours = punchInLocalDateTime.getHour();
            double punchInMinutes = punchInLocalDateTime.getMinute();
            double punchOutHours = punchOutLocalDateTime.getHour();
            double punchOutMinutes = punchOutLocalDateTime.getMinute();
            double punchInTimeInHours = punchInHours + (punchInMinutes/60);
            double punchOutTimeInHours = punchOutHours + (punchOutMinutes/60);
            double hoursWorkedThisShift = punchOutTimeInHours - punchInTimeInHours;
            this.hoursWorked += hoursWorkedThisShift;
            this.punchInLocalDateTime = null;
        }
    }
}
