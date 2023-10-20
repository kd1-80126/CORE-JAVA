package com.sunbeam;

public class main {

	public static void main(String[] args) {
		Emp[]arr= new Emp[3];
		arr[0]= new Mnager(5000.0,100.0);
		arr[1]= new Clerk(2000.0);
		arr[2]= new Labour(3000.0,100.0);
		double totalIncome = Emp.calcTotalIncome(arr);
		System.out.println(totalIncome);

 		

	}

}
