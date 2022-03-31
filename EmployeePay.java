package com.employeewage;

public class EmployeePay {

    static int present = 1;
    static int Wage_Per_Hour = 20;
    static int Total_Working_Hrs = 8;
    static int PART_TIME = 2;
    static int Part_Time_Working_Hrs = 4;

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

    static void partTimeEmployee() {
        double empCheck = Math.floor((Math.random() * 10) % 3);
        if (present == empCheck) {
            System.out.println("Employee wage per day = " + Total_Working_Hrs * Wage_Per_Hour);
        } else if (PART_TIME == empCheck) {
            System.out.println("Employee is Working in Partime wage is =" + Part_Time_Working_Hrs * Wage_Per_Hour);
        }
    }

    static void empWageSwitchCase() {
        int emp_check = (int) Math.floor((Math.random() * 10) % 2 + 1);
        switch (emp_check) {
            case present:
                System.out.println("Employee Working in Full Time");
                System.out.println("Employee Wage is =" + Wage_Per_Hour * Total_Working_Hrs);
                break;
            case PART_TIME:
                System.out.println("Employee Working in Part Time");
                System.out.println("Employee Wage is = " + Wage_Per_Hour * Part_Time_Working_Hrs;
                break;
            default:
                System.out.println("Employee is Absent");
        }
    }

}


