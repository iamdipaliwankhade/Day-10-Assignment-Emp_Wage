package com.employeewage;

import java.util.ArrayList;

public class CompanyEmpWage {
	private String companyName;
	private int wagePerHr;
	private int totalWorkingDays;
	private int totalWorkingHrs;
	private int totalEmpWage;

	private ArrayList<Integer> dailyWages;

	// parametrized constructor
	public CompanyEmpWage(String companyName, int wagePerHr, int totalWorkingDays, int totalWorkingHrs) {
		this.companyName = companyName;
		this.wagePerHr = wagePerHr;
		this.totalWorkingDays = totalWorkingDays;
		this.totalWorkingHrs = totalWorkingHrs;
		dailyWages = new ArrayList<>();
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getWagePerHr() {
		return wagePerHr;
	}

	public void setWagePerHr(int wagePerHr) {
		this.wagePerHr = wagePerHr;
	}

	public int getTotalWorkingDays() {
		return totalWorkingDays;
	}

	public void setTotalWorkingDays(int totalWorkingDays) {
		this.totalWorkingDays = totalWorkingDays;
	}

	public int getTotalWorkingHrs() {
		return totalWorkingHrs;
	}

	public void setTotalWorkingHrs(int totalWorkingHrs) {
		this.totalWorkingHrs = totalWorkingHrs;
	}

	public int getTotalEmpWage() {
		return totalEmpWage;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	public ArrayList<Integer> getDailyWages() {
		return dailyWages;
	}

	public void setDailyWages(ArrayList<Integer> dailyWages) {
		this.dailyWages = dailyWages;
	}

	@Override
	public String toString() {
		return "CompanyEmpWage{" + "companyName='" + companyName + '\'' + ", wagePerHr=" + wagePerHr
				+ ", totalWorkingDays=" + totalWorkingDays + ", totalWorkingHrs=" + totalWorkingHrs + ", totalEmpWage="
				+ totalEmpWage + ", dailyWages=" + dailyWages + '}';
	}
}