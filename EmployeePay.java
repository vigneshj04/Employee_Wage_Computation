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
            case 1:
                System.out.println("Employee Working in Full Time");
                System.out.println("Employee Wage is =" + Wage_Per_Hour * Total_Working_Hrs);
                break;
            case 2:
                System.out.println("Employee Working in Part Time");
                System.out.println("Employee Wage is = " + Wage_Per_Hour * Part_Time_Working_Hrs);
                break;
            default:
                System.out.println("Employee is Absent");
        }
    }

    public static void empWageDays() {
        final int IS_PART_TIME = 1;
        final int IS_FULL_TIME = 2;
        final int EMP_RATE_PER_HOUR = 20;
        final int NUM_OF_WORKING_DAYS = 20;

        int empHrs = 0;
        int empWage = 0;
        int totalWage = 0;

        for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
            int empCheck = (int) Math.floor((Math.random() * 10) % 3);
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalWage += empWage;
            System.out.println("Emp wage = " + empWage);
        }
        System.out.println("Total Wage : " + totalWage);
    }

    public static void employeeWageMonthly() {

        final int IS_PART_TIME = 1;
        final int IS_FULL_TIME = 2;
        final int EMP_RATE_PER_HOUR = 20;
        final int NUM_OF_WORKING_DAYS = 20;
        final int MAXI_HRS_IN_MONTH = 100;

        int empWage = 0;
        int totalWage = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= MAXI_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            int empHrs = 0;
            totalWorkingDays++;
            int empCheck = (int) Math.floor((Math.random() * 10) % 3);
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalWage += empWage;
            System.out.println("Emp wage = " + empWage);
        }
        System.out.println("Total Wage : " + totalWage);
    }
}


