package com.sunbeam;

import java.util.Scanner;

public class Assignment12main {

	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: " + result);
	}

	static int menu() {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("1.Exit");
		System.out.println("2.Addition");
		System.out.println("3.subtraction");
		System.out.println("4.Multiplication");
		
		System.out.println("Enter choice");
		choice = sc.nextInt();

		return choice;
	}

	public static void main(String[] args)
	{int choice;
	
		do {
			choice = menu();
			
			switch(choice)
			{
			    case 1:
			  {
				System.out.println("exiting the program");
				
			    }
			break;
			case 2:
			{
				Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter first no:");
			double x=sc.nextInt();
			System.out.println("Enter second no:");
			double y=sc.nextInt();
			
			calculate(x,y,(t,u)-> t + u );
			}
				break;
				
			case 3:
			{
				Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter first no:");
			double x=sc.nextInt();
			System.out.println("Enter second no:");
			double y=sc.nextInt();
			
			calculate(x,y,(t,u)->t - u );
				break;
			}
				
				case 4:
				{
					Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter first no:");
				double x=sc.nextInt();
				System.out.println("Enter second no:");
				double y=sc.nextInt();
				
				calculate(x,y,(t,u)-> t * u );
					break;
			}
		}
		
		
	}while(choice!=1);

}
}
