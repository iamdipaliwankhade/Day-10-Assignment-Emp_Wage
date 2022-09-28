package com.employeewage;
/**
 * 
 * @param args
 */
public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation program");

		int IS_FULL_TIME = 1;
		int wagePerHour = 20;
		int fullDayHour = 8;
		int partTimeHour = 4;

		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is present");
			System.out.println("Employee daily wage=" + fullDayHour * wagePerHour);
		} else if (empCheck == 0) {
			System.out.println("Employee is absent");
		} else {
			System.out.println("Employee working as a part time");
			System.out.println("Employee part time wage :" + partTimeHour * wagePerHour);
		}
	}
}