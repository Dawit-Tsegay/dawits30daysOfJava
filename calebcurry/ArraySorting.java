package com.dawittsegay.calebcurry;

public class ArraySorting {

	public static void main(String[] args) {
		
		//this is used to sort an array
		int[] grades = {3, 1, 2, 72, 14, 27};
		Arrays.sort(grades);  //we can also say "Arrays.parallelSort(grades)" , but this is for a very large valued array.
		System.out.println(Arrays.toString(grades));
	}

}
