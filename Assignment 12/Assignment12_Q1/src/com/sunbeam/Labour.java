package com.sunbeam;

public class Labour implements Emp {

	private double hours;
	private double rate;
	
	
	
	public Labour(double hours, double rate) {
		
		this.hours = hours;
		this.rate = rate;
	}

	@Override
	public double getSal() {
		// TODO Auto-generated method stub
		return this.hours*this.rate;
	}
	

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double calcIncentives()
	{
		if (this.hours>300)
		{
			return 0.05*hours*rate;
		
		}
		return 0.0;
		
	}
	

