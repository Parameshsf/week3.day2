package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = { 3, 2, 11, 4, 6, 7 };
		int[] array2 = { 1, 2, 8, 4, 9, 7 };
		Set<Integer> temp = new LinkedHashSet<Integer>();
		int firstDuplicate = 0;
		
		System.out.println("The number matches in both the arrays are: ");

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.println(array2[j]);
					temp.add(array2[j]);
					
				}
			}
		}
		System.out.println("Moving all the duplicate values to a Set: "+temp);
		for (int dup : temp) {
			firstDuplicate = dup;
			break;

		}
		System.out.println("The first duplicate is " + firstDuplicate);

	}

}
