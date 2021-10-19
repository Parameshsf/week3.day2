package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExercise {

	public void listWork() {
		// TODO Auto-generated method stub
		List<String> empList = new ArrayList<String>();
		empList.add("Param");
		empList.add("Sangeetha");
		empList.add("Harsha");
		empList.add("Kala");

		System.out.println("The list of employees are " + empList);
		System.out.println("The list size is " + empList.size());

		// Sort
		Collections.sort(empList);
		System.out.println("After Sorting " + empList);

	}

	public void findTrain() {
		// TODO Auto-generated method stub
		List<String> trainList = new ArrayList<String>();
		trainList.add("Rajdhani");
		trainList.add("BangaloreExpress");
		trainList.add("MysoreExpress");
		trainList.add("BangaloreExpress");
		trainList.add("PandianExpress");

		System.out.println("Before Sorting the list " + trainList);

		Collections.sort(trainList);

		System.out.println("After Sorting the list " + trainList);

		int size = trainList.size();
		
		System.out.println("Display the last train from the list " + trainList.get(size - 2));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListExercise lst = new ListExercise();
		lst.listWork();
		lst.findTrain();

	}

};