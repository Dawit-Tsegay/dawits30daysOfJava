package com.dawittsegay.calebcurry;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAddingAndRemovingValues {

	public static void main(String[] args) {
		//GENERIC - they are represented by " < > " create a class that can work with different types
		List<Integer> grades = new ArrayList<Integer>();
		List<Integer> gd = new LinkedList<Integer>();//we can also say linkedlist
		
		/*grades.add(5);
		grades.add(10);
		
		System.out.println(grades.get(0));
		System.out.println(grades.get(1));//here 10 is replaced by 7.
		System.out.println(grades.get(2));
		System.out.println(grades.indexOf(5));
		System.out.println(grades.contains(7)); // this tells if an array has already have the value imported by us and it returns either true or false
		
		
		the above codes run
		*/
		if (!grades.isEmpty()) {
			System.out.println(grades.get(0));
		} 
	}
}
