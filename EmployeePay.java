package com.employeewage;

public class EmployeePay {

    static int present = 1;

    static void attendanceOfEmployee() {
        double empCheck = Math.floor((Math.random() * 10) % 2);
        if (empCheck == present) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }


}


