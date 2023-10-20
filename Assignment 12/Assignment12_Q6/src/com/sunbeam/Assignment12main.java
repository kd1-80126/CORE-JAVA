package com.sunbeam;

import java.util.Scanner;
import java.util.stream.Stream;

public class Assignment12main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no to get factorial: ");
		int num1 = sc.nextInt();
		
		Stream<Integer> strm = Stream.iterate(1, i->i+1).limit(num1);
		int sum=  strm.reduce(1, (a,e)-> a*e);
System.out.println(sum);
	}

}
