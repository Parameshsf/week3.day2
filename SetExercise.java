package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExercise {
	
	public void hashset() {
		// TODO Auto-generated method stub
		Set<String> comp = new HashSet<String>(); //Orders value randomly with unique hash value
		comp.add("TCS");
		comp.add("Infosys");
		comp.add("Accenture");
		comp.add("Capgemini");
		comp.add("Amazon");
		
		System.out.println("HashSet Order of Company "+comp);

	}
	
	public void treeSet() {
		// TODO Auto-generated method stub
		Set<String> comp = new TreeSet<String>(); //Orders based on ASCII (Ascending) 
		comp.add("TCS");
		comp.add("Infosys");
		comp.add("Accenture");
		comp.add("Capgemini");
		comp.add("Amazon");
		
		System.out.println("TreeSet Order of Company "+comp);

	}
	
	public void linkedHashSet() {
		// TODO Auto-generated method stub
		Set<String> comp = new LinkedHashSet<String>(); //Orders maintained in the same insertion order 
		comp.add("TCS");
		comp.add("Infosys");
		boolean checkDuplicate = comp.add("Accenture");
		System.out.println("If there is no duplicate, it returns " +checkDuplicate);
		comp.add("Capgemini");
		comp.add("Amazon");
		boolean cD = comp.add("Accenture");//Set does not allow duplicates
		System.out.println("If there is a duplicate, it will not add the data in to Set and it returns " +cD);
		
		System.out.println("LinkedHashSet Order of Company "+comp);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetExercise st = new SetExercise();
		st.hashset();
		st.treeSet();
		st.linkedHashSet();
	}

}
