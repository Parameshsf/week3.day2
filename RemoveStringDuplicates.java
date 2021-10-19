package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveStringDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "PayPal India";
		char[] charArray = str.toCharArray();
		
		System.out.println("The String to be removed with duplicates: '"+str+"'");

		Set<Character> cs = new LinkedHashSet<Character>();
		cs.add(charArray[0]); // Assigning first character to cs Set.

		Set<Character> dupSet = new LinkedHashSet<Character>();

		for (int i = 1; i < charArray.length; i++) {
			if (cs.contains(charArray[i]) == false && charArray[i] != ' ') {
				cs.add(charArray[i]);

			} else if (charArray[i] != ' ') {
				dupSet.add(charArray[i]);

			}

		}
		System.out.println("CharSet after removal of duplicate characters " + cs);
		System.out.println("DupSet with ONLY duplicate characters from CharSet " + dupSet);
	}

}
