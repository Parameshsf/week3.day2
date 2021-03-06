package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		//Using Arrays Sort
		Arrays.sort(data);
		int arrLength = data.length;
		System.out.println("The secong last element from an array is: "+data[arrLength - 2]);
		
		//Using List Converting array values in to List
		List<Integer> lst = new ArrayList<Integer>(); 
		
		for (int i = 0; i < data.length; i++) {
			lst.add(data[i]);
			
		}
		System.out.println("The values in List before sort "+lst);
		Collections.sort(lst);
		System.out.println("The values in List After sort "+lst);
		System.out.println("The second last element from the list: "+lst.get(lst.size()-2));

	}

}
