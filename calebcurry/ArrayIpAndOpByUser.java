package com.dawittsegay.calebcurry;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayIpAndOpByUser {
	//this is for looping array using a for loop
	public static void main(String[] args) {
		int[] grades = new int[6];
		System.out.println("enter the six values of an array that you need? ");
		Scanner x= new Scanner(System.in);
		
		for (int i = 0; i < 6; i++) {
			int var = x.nextInt(); 
			grades[i] =var;
		}
		System.out.println(Arrays.toString(grades));
		
		
		
		/*
		 * in the following code you first give the size of the array and then only you 
		 * can get the values ordered according to the sequence of the array.
		*/
		System.out.println("Enter a size for an array and then enter the values for the array? ");
		Scanner y= new Scanner(System.in);
		int size = y.nextInt(); 
		int[] userip = new int[size];
		
		
		for (int i = 0; i < size; i++) {
			int z = y.nextInt(); 
			userip [i] = z;
		}
		System.out.println(Arrays.toString(userip ));
	}

}
