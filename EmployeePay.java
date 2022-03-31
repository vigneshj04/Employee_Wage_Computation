package com.employeewage;

public class EmployeePay {

    static int present = 1;
    static int Wage_Per_Hour = 20;
    static int Total_Working_Hrs = 8;

    static void attendanceOfEmployee() {
        double empCheck = Math.floor((Math.random() * 10) % 2);
        if (empCheck == present) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }

    static void wageOfEmployee() {
        double empCheck = Math.floor((Math.random() * 10) % 1 + 1);
        if (present == empCheck) {
            System.out.println("Employee wage per day = " + Total_Working_Hrs * Wage_Per_Hour);
        }
    }

}


