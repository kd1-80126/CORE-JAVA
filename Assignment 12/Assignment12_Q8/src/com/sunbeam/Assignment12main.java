package com.sunbeam;

import java.util.stream.IntStream;

public class Assignment12main {

	public static void main(String[] args) {

		
		IntStream strm1 = IntStream.range(1, 10);
		int total = strm1.sum();
		System.out.println(total);
		
		IntStream strm2 = IntStream.range(0, 10);
		System.out.println(strm2.summaryStatistics());
	}

}
