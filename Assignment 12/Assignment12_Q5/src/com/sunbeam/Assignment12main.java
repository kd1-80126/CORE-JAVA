package com.sunbeam;

public class Assignment12main {
	static <T> int countIf(T[] arr, T key, check<T> c)
	{
		int cnt=0;
		for( T ele:arr)
		{
			if(c.compare( ele,key))
				cnt++;
		}
		return cnt;
	}
	
	public static void main(String[] args) {

		Integer [] arr = {44, 77, 99, 22, 55, 66};
		Integer key = 50;
		int cnt = countIf(arr, key, (x,y)-> x > y);
		System.out.println("Count = " + cnt); // 4 (because 4 elements in array are greater than given key i.e. 50)
		
		Double[] arr2= {1.1,1.2,1.1,1.3,1.4,1.5,1.5,1.1,2.1,1.1,2.1,1.1,1.1,1.1,1.1};
		Double key2=1.1;
		int cnt2= countIf(arr2,key2,(e,k)-> e.equals(k));
		System.out.println(cnt2);
		
		
	}

}
