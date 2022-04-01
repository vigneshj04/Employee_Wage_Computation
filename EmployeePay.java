package com.employeewage;

public class EmployeePay {

    static int PRESENT = 1;
    static int WAGE_PER_HR = 20;
    static int TOTAL_WORKING_HRS = 8;
    static int PART_TIME = 2;
    static int PART_TIME_WORKING_HRS = 4;

    static void attendanceOfEmployee() {
        double empCheck = Math.floor((Math.random() * 10) % 2);
        if (empCheck == PRESENT) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }

    static void wageOfEmployee() {
        double empCheck = Math.floor((Math.random() * 10) % 1 + 1);
        if (PRESENT == empCheck) {
            System.out.println("Employee wage per day = " + TOTAL_WORKING_HRS * WAGE_PER_HR);
        }
    }

    static void partTimeEmployee() {
        double empCheck = Math.floor((Math.random() * 10) % 3);
        if (PRESENT == empCheck) {
            System.out.println("Employee wage per day = " + TOTAL_WORKING_HRS * WAGE_PER_HR);
        } else if (PART_TIME == empCheck) {
            System.out.println("Employee is Working in Partime wage is =" + PART_TIME_WORKING_HRS * WAGE_PER_HR);
        }
    }

    static void empWageSwitchCase() {

        int emp_check = (int) Math.floor((Math.random() * 10) % 2 + 1);
        switch (emp_check) {
            case 1:
                System.out.println("Employee Working in Full Time");
                System.out.println("Employee Wage is =" + WAGE_PER_HR * TOTAL_WORKING_HRS);
                break;
            case 2:
                System.out.println("Employee Working in Part Time");
                System.out.println("Employee Wage is = " + WAGE_PER_HR * PART_TIME_WORKING_HRS);
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
            empWage = empHrs * WAGE_PER_HR;
            totalWage += empWage;
            System.out.println("Emp wage = " + empWage);
        }
        System.out.println("Total Wage : " + totalWage);
    }
    public static int calculateEmpWageForCompany(String company, int empRate, int numOfDays, int maxHrs) {
        final int IS_PART_TIME = 1;
        final int IS_FULL_TIME = 2;
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
            empWage = empHrs * WAGE_PER_HR;
            totalWage += empWage;
            System.out.println("Emp wage = " + empWage);
        }
        System.out.println("Total Wage for Company : "+company +" " + totalWage);
        return totalWage;
    }

}


