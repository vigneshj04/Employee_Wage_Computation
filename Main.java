package com.employeewage;

import java.util.Scanner;

import static com.employeewage.EmployeePay.attendanceOfEmployee;
import static com.employeewage.EmployeePay.wageOfEmployee;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("1.Employee Attendance");
        System.out.println("2.Wage per day for the Employee");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                attendanceOfEmployee();
                break;
            case 2:
                wageOfEmployee();
                break;

        }
    }
}