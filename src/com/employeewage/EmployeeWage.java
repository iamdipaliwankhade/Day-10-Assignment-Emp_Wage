package com.employeewage;
/**
 * 
 * @param args
 */
public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation program");
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int wagePerHour = 20;
		int fullDayHour = 8;
		int partTimeHour = 4;
		int workingDayPerMonth = 20;

		int isPresent = (int) Math.floor(Math.random() * 3);
		switch (isPresent) {
		case 0:
			System.out.println("Employee is present");
			System.out.println("Employee wage=" + fullDayHour * wagePerHour);
			int totalHourPerMonth = 1;
			while (totalHourPerMonth <= 100) {
				totalHourPerMonth++;
			}
			System.out.println("Employee monthly wage=" + totalHourPerMonth * wagePerHour);
			break;

		case 1:
			System.out.println("Employee is present as a part time");
			System.out.println("Employee wage=" + partTimeHour * wagePerHour);
			System.out.println("Employee monthly wage=" + partTimeHour * wagePerHour * workingDayPerMonth);
			break;

		case 2:
			System.out.println("Employee is absent");
			System.out.println("Employee wage=0");
			break;

		}

	}
}