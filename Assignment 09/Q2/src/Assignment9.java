import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


class Arraysorting implements Comparator<Double>
{

	@Override
	public int compare(Double list1, Double list2) {
		int diff=Double.compare(list1, list2);
				
		return diff;
	}
	
}

public class Assignment9 {

	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
		if(c.compare(arr[i], arr[j]) > 0) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
		}
		}
		}
	
	
	
	
	
	public static void main(String[] args) {
		
		Double[] list = { 44.5,100.6,78.22,1.2,42.5,55.2 };
		for(double e:list)
		{
			System.out.println(e);
		}
		
		Arraysorting compare=new Arraysorting();
		
		selectionSort(list,compare);
		
		System.out.println("sorted array is:");
		for(double e:list)
		{
			System.out.println(e);
		}
		
	}



	

}
