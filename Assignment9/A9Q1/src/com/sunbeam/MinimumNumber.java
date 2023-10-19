package com.sunbeam;

public class MinimumNumber {
	static <T extends Number> T findMin(T[] arr) {
		T min = arr[0];
		for (T element : arr) {
			if (min.doubleValue() > element.doubleValue()) {
				min = element;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Integer[] arr1 = { 22, 55, 77, 11, 33 };
		Integer min1 = findMin(arr1);
		System.out.println("Minimum number from arr1 is:" + min1);
		Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		Double min2 = findMin(arr2);
		System.out.println("Minimum number from arr2 is:" + min2);
	}
}