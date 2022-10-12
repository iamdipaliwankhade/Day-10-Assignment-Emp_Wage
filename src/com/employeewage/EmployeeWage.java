package com.employeewage;

import java.util.ArrayList;

/**
 * 
 * @author Dipali
 *
 */
public class EmployeeWage implements IEmployeeWage {

	// Declaring a constant
	public static final int IS_FULLTIME = 1;
	public static final int IS_PARTTIME = 2;

	private ArrayList<CompanyEmpWage> companyEmpWageList;

	private CompanyEmpWage companyEmpWage;

	public EmployeeWage() {
		companyEmpWageList = new ArrayList<>();
	}

	public void addCompany(String companyName, int wagePerHr, int totalWorkingDays, int totalWorkingHrs) {
		companyEmpWage = new CompanyEmpWage(companyName, wagePerHr, totalWorkingDays, totalWorkingHrs);
		companyEmpWage.setTotalEmpWage(computeEmployeeWage(wagePerHr, totalWorkingDays, totalWorkingHrs));
		companyEmpWageList.add(companyEmpWage);

	}

	public int computeEmployeeWage(int wagePerHr, int totalWorkingDays, int totalWorkingHrs){

	private String companyName;
	private int wagePerHr;
	private int totalWorkingDays;
	private int totalWorkingHrs;

	public EmployeeWage(String companyName, int wagePerHr, int totalWorkingDays, int totalWorkingHrs) {
		this.companyName = companyName;
		this.wagePerHr = wagePerHr;
		this.totalWorkingDays = totalWorkingDays;
		this.totalWorkingHrs = totalWorkingHrs;
	}

	public int computeEmployeeWage() {
		int fullTimeHrs = 8;
		int partTimeHrs = 4;
		int totalHrs = 0;
		int days = 0;
		while (totalHrs < totalWorkingHrs && days < totalWorkingDays) {
			days++;
			int isPresent = (int) Math.floor(Math.random() * 10) % 3;
			switch (isPresent) {
			case IS_FULLTIME:
				totalHrs += fullTimeHrs;
				companyEmpWage.getDailyWages().add(fullTimeHrs);
				break;
			case IS_PARTTIME:
				totalHrs += partTimeHrs;
				companyEmpWage.getDailyWages().add(partTimeHrs);
				break;
			default:
				companyEmpWage.getDailyWages().add(0);
			}

		}

		while (totalHrs < totalWorkingHrs && days < totalWorkingDays) {
			days++;

			int isPresent = (int) Math.floor(Math.random() * 10) % 3;
			switch (isPresent) {
			case 1:
				totalHrs += fullTimeHrs;
				break;
			case 2:
				totalHrs += partTimeHrs;
				break;
			default:
				totalHrs += 0;

			}
		}
		return totalHrs * wagePerHr;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		EmployeeWage employeeWage = new EmployeeWage();
		employeeWage.addCompany("WIPRO", 8, 8, 30);
		employeeWage.addCompany("BRIDGELABZ", 12, 8, 40);
		employeeWage.addCompany("TCS", 18, 50, 30);
		employeeWage.addCompany("TATA", 12, 30, 10);

		for (CompanyEmpWage cmp : employeeWage.companyEmpWageList) {
			System.out.println(cmp.getCompanyName() + " : " + cmp.getTotalEmpWage());
			System.out.print(cmp.getDailyWages());
			System.out.println();
		}

	}
}