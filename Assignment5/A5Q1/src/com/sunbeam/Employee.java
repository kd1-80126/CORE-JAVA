package com.sunbeam;
import java.util.Scanner;

abstract public class Employee {
	private String fName;
	private String lName;
	private int ssn;

	public Employee(String fName, String lName, int ssn) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.ssn = ssn;
	}

	public Employee() {
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name:");
		fName = sc.next();
		System.out.println("Enter the last name:");
		lName = sc.next();
		System.out.println("Enter the social security number:");
		ssn = sc.nextInt();
	}

	public void displayData() {
		System.out.println("Name of Employee:" + this.fName + " " + this.lName);
		System.out.println("Social security number:" + this.ssn);
	}

	public void calculateSalary() {
	}

	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + ", ssn=" + ssn + "]";
	}
}

/*
 * A company pays its employees on a weekly basis. The employees are of four
 * types: Salaried employees are paid a fixed weekly salary regardless of the
 * number of hours worked. Hourly employees are paid by the hour and receive
 * overtime pay (i.e., 1.5 times their hourly salary rate) for all hours worked
 * in excess of 40 hours. Commission employees are paid a percentage of their
 * sales. Base-salaried commission employees receive a base salary plus a
 * percentage of their sales. For the current pay period, the company has
 * decided to reward salaried-commission employees by adding 10% to their base
 * salaries. The company wants to write an application that performs its payroll
 * calculations polymorphically.
 */

/*
 * Salaried employees Hourly employees Commission employees Base-salaried
 * commission employees
 */