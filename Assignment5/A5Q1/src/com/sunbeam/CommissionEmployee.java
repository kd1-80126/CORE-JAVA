package com.sunbeam;
import java.util.Scanner;

public class CommissionEmployee extends Employee {
	double grossSale;
	double commissionRate;

	public CommissionEmployee(String fName, String lName, int ssn, double grossSale, double commissionRate) {
		super(fName, lName, ssn);
		this.grossSale = grossSale;
		this.commissionRate = commissionRate;
	}

	public CommissionEmployee() {
	}

	public double getGrossSale() {
		return grossSale;
	}

	public void setGrossSale(double grossSale) {
		this.grossSale = grossSale;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	@Override
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		super.acceptData();
		System.out.println("Enter the gross sale:");
		this.grossSale = sc.nextDouble();
		System.out.println("Enter the commission rate:");
		this.commissionRate = sc.nextDouble();
	}

	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Gross sale:" + this.grossSale);
		System.out.println("Commission rate:" + this.commissionRate);
	}

	@Override
	public void calculateSalary() {
		super.calculateSalary();
		System.out.println("Employee salary:" + (this.grossSale * this.commissionRate));
	}

	@Override
	public String toString() {
		return "CommissionEmployee [grossSale=" + grossSale + ", commissionRate=" + commissionRate + "]";
	}

}
