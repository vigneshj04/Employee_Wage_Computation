package com.employeewage;

import java.util.Scanner;

import static com.employeewage.EmployeePay.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("1.Employee Attendance");
        System.out.println("2.Wage per day for the Employee");
        System.out.println("3.Wage per day for the Part Time Employee");
        System.out.println("4.Wage Calculation Using Switch Case");
        System.out.println("5.Employee Wage for 20 Days");
        System.out.println("6.Employee Monthly Wage");
        System.out.println("7.Employee Monthly Wage For a Particular Company");
        System.out.println("8.Employee Monthly Wage For Multiple Companies");
        System.out.println("Enter the choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                attendanceOfEmployee();
                break;
            case 2:
                wageOfEmployee();
                break;
            case 3:
                partTimeEmployee();
                break;
            case 4:
                empWageSwitchCase();
                break;
            case 5:
                empWageDays();
                break;
            case 6:
                employeeWageMonthly();
                break;
            case 7:
                calculateEmpWageForCompany("DMart", 20,20,100);
                break;
            case 8:
                multiCompanyEmpWage();
                break;
        }
    }

    static void multiCompanyEmpWage(){
        EmployeePay.calculateEmpWageForCompany("DMart", 20,20,100);
        EmployeePay.calculateEmpWageForCompany("Reliance", 20,22,98);
    }
}