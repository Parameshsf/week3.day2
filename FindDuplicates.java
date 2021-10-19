package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

	public void findDuplicate() {
		// TODO Auto-generated method stub
		int[] numArray = { 100, 10, 24, 35, 10, 30 };

		Set<Integer> unique = new LinkedHashSet<Integer>();

		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] == 10) {
				System.out.println("The duplicate number is " + numArray[i]);
				unique.add(numArray[i]);

			} else {
				unique.add(numArray[i]);
			}

		}
		System.out.println("The integer Array Values after duplicates removed " + unique);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindDuplicates fd = new FindDuplicates();
		fd.findDuplicate();

	}

}
