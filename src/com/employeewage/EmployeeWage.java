package com.employeewage;
/**
 * 
 * @param args
 */
public class EmployeeWage {
	int wagePerHour = 20;
	int fullTimeHour = 8;
	int partTimeHour = 4;
	int workingDayPerMonth = 20;
	int totalWorkingHour = 100;
	int totalEmpHour = 0;
	int totalWorkingDays = 0;

	public void computeEmpWage() {
		while (totalEmpHour < totalWorkingHour && totalWorkingDays < workingDayPerMonth) {
			totalWorkingDays++;
			int isPresent = (int) Math.floor(Math.random() * 10) % 3;
			switch (isPresent) {
			case 0:
				System.out.println("Employee is present");
				totalEmpHour += fullTimeHour;
				break;
			case 1:
				System.out.println("Employee is present as a part time");
				totalEmpHour += partTimeHour;
				break;
			case 2:
				System.out.println("Employee is absent");
				totalEmpHour += 0;
				break;
			}
		}
		System.out.println("Monthly Wage : " + totalEmpHour * wagePerHour);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation program");

		EmployeeWage employeeWage = new EmployeeWage();

		employeeWage.computeEmpWage();
	}
}