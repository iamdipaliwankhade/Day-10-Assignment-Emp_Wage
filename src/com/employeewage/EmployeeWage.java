package com.employeewage;

/**
 * 
 * @author Dipali
 *
 */
public class EmployeeWage {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {

		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {

			case 1:
				IS_PART_TIME: empHrs = 4;
				break;

			case 2:
				IS_FULL_TIME: empHrs = 8;
				break;
			default:
				empHrs = 0;

			}

			totalEmpHrs += empHrs;
			System.out.println("Day: " + totalWorkingDays + " Emp Hr: " + empHrs);

		}

		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Emp Wage for Company: " + company + " is: " + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage for multiple companies");

		computeEmpWage("WIPRO", 8, 8, 30);

		computeEmpWage("BRIDGLABZ", 12, 8, 40);

		computeEmpWage("TCS", 18, 50, 30);

		computeEmpWage("TATA", 12, 30, 10);

	}
}