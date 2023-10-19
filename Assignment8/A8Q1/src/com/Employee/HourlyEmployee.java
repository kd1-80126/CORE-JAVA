package com.Employee;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
	double wage;
	double workedhours;

	public HourlyEmployee(String fName, String lName, int ssn, double wage, double workedhours) {
		super(fName, lName, ssn);
		this.wage = wage;
		this.workedhours = workedhours;
	}

	public HourlyEmployee() {
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getWorkedhours() {
		return workedhours;
	}

	public void setWorkedhours(double workedhours) {
		this.workedhours = workedhours;
	}

	@Override
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		super.acceptData();
		System.out.println("Enter the hourly wage of an employee:");
		this.wage = sc.nextDouble();
		System.out.println("Enter the total number of hours worked:");
		this.workedhours = sc.nextDouble();
	}

	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Hourly wage of an employee:" + this.wage);
		System.out.println("Total number of hours worked:" + this.workedhours);
	}

	@Override
	public void calculateSalary() {
		if (this.workedhours <= 40) {
			System.out.println("Employee Salary:" + (this.wage * this.workedhours));
		} else if (this.workedhours > 40) {
			System.out.println("Employee Salary:" + ((this.wage * 40) + ((this.workedhours - 40) * 1.5 * this.wage)));
		}
	}

	@Override
	public String toString() {
		return "HourlyEmployees [wage=" + wage + ", workedhours=" + workedhours + "]";
	}

}