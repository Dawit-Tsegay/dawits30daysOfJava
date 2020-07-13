package com.dawittsegay.calebcurry;

public class ArrayListUsingForLoop {

	public static void main(String[] args) {
		
		//iterating through loops
		List<Integer> grades = Arrays.asList(5, 4, 3, 2, 1);
		//grades.size: returns number of elements in an array
		for (int i = 0; i < grades.size(); i++) {
			grades.set(i, grades.get(i) * 2);
			//here the grades.get(i) gets the value and then multiply it by two and then set it to an index (i)
			System.out.println(grades.get(i));
		}

	}

}
