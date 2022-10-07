package com.employeewage;


/**
 * 
 * @author Dipali
 *
 */
public class EmployeeWage {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	private final String companyName;
	private final int empRatePerHour;
	private final int noOfWorkingDays;
	private final int maxHoursPerMonth;

	public EmployeeWage(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth) {
		companyName = company;
		this.empRatePerHour = empRatePerHour;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	private int computeEmpWage() {
		// Variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays <= noOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case 1:
				IS_FULL_TIME: empHrs = 8;
				break;
			case 2:
				IS_PART_TIME: empHrs = 4;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day:" + totalWorkingDays + "Emp Hrs:" + empHrs);
		}
		return totalEmpHrs * empRatePerHour;
	}

	public static void main(String[] args) {
		EmployeeWage e1 = new EmployeeWage("TCS", 18, 50, 30);
		EmployeeWage e2 = new EmployeeWage("WIPRO", 8, 8, 30);
		EmployeeWage e3 = new EmployeeWage("BRIDGLABZ", 12, 8, 40);
		EmployeeWage e4 = new EmployeeWage("TATA", 12, 30, 10);

		System.out.println(e1.companyName + " : " + e1.computeEmpWage());
		System.out.println(e2.companyName + " : " + e2.computeEmpWage());
		System.out.println(e3.companyName + " : " + e3.computeEmpWage());
		System.out.println(e4.companyName + " : " + e4.computeEmpWage());

	}
}