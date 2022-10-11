package com.employeewage;


/**
 * 
 * @author Dipali
 *
 */
public class EmployeeWage implements IEmployeeWage {

	// Declaring a constant
	public static final int IS_FULLTIME = 1;
	public static final int IS_PARTTIME = 2;
	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWages;

	public EmployeeWage() {
		companyEmpWages = new CompanyEmpWage[10];
	}

	public void addCompany(String companyName, int wagePerHr, int totalWorkingDays, int totalWorkingHrs) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, wagePerHr, totalWorkingDays, totalWorkingHrs);
		companyEmpWage.setTotalEmpWage(computeEmployeeWage(wagePerHr, totalWorkingDays, totalWorkingHrs));
		companyEmpWages[numOfCompany] = companyEmpWage;
		numOfCompany++;
	}

	public int computeEmployeeWage(int wagePerHr, int totalWorkingDays, int totalWorkingHrs) {
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
				break;
			case IS_PARTTIME:
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
		employeeWage.addCompany("BRIDELABZ", 12, 8, 40);
		employeeWage.addCompany("TCS", 18, 50, 30);
		employeeWage.addCompany("TATA", 12, 30, 10);

		for (int i = 0; i < employeeWage.numOfCompany; i++) {
			System.out.println(employeeWage.companyEmpWages[i].getCompanyName() + " : "
					+ employeeWage.companyEmpWages[i].getTotalEmpWage());
		}

	}
}