package com.dawittsegay.calebcurry;

public class ArraysToStringAndDeepToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] grades = {10, 13, 23, 34, 32, 2, 45, 56, 53, 12};
		System.out.println(grades);//this prints the memory location not the value of the array
		System.out.println(Arrays.toString(grades));//this prints the actual contents of the array
		
		/*the following is a way to print array of an array using "deep to string"*/
		int[][] x= {{10, 13, 23} ,{ 34, 32, 2, 45, 56, 53, 12}};
		System.out.println(Arrays.deepToString(x));//
	}

}
