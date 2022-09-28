package com.employeewage;
/**
 * 
 * @param args
 */
public class EmployeeWage {
	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program.");

		int isPresent = 1;
		int empRatePerHr = 20;
		int workinghr;
		int salary;

		double randomCheck = Math.floor(Math.random() * 10) % 2;
		if (isPresent == randomCheck) {
			System.out.println("Employee is present");
			workinghr = 8;
		} else {
			System.out.println("Employee is Absent");
			workinghr = 0;
		}

		salary = empRatePerHr * workinghr;
		System.out.println("Employee daily wage :" + salary);

	}
}