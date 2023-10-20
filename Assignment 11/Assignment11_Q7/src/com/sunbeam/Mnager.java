package com.sunbeam;

public class Mnager implements Emp {

	private double basicSalary;
	private double dearanceAllowance;
	
	
	public Mnager(double basicSalary, double dearanceAllowance) {
		
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}
	
	
	@Override
	public double getSal() {
		
		return basicSalary+dearanceAllowance;
	}
	
	public double calcIncentives()
	{
		double incentive= this.basicSalary * 0.2;
		return incentive;
	}
	
	
	
	
	


	



}
