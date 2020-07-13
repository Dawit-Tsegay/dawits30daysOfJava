package com.dawittsegay.calebcurry;

import java.util.Scanner;

public class IntroToWhileLoops {

	public static void main(String[] args) {
		String password = "dadihani02";
		System.out.println("Enter the pass word-> ");
		
		Scanner x = new Scanner(System.in);
		
		String pw = x.nextLine();
		/*
		while(pw.equals(password)) {//this means its is checking if pw and password are equal. and returns true if they are equal..
			System.out.println("congratulations");
			break;
		}
		*/
		while(!pw.equals(password)) { //this line checks if the pw and password are not equal. and returns true if they are not equal 
			System.out.println("WRONG PASSWORD! please enter the password again");
			pw = x.nextLine();
			
		}
		System.out.println("Congratulations! you have found the password");
		/*loops are 
		 * 
		 * while loops
		 * for loop 
		 * do while loop
		 * for each
		 * */

	}

}





















/*
 * public static void main(String[] args) {
		/* TODO Auto-generated method stub
		System.out.println("guess the password");
		String passwd = "dawit";
		Scanner pw = new Scanner(System.in);
		String x = pw.nextLine();
		while(!x.equals(passwd)) {
			System.out.println("Guess the password again. don't quit: ");
			x = pw.nextLine();
		}
		System.out.println("finally you got it right, Bravo! ");
		
		*
		*the following is a way to use the do while loop*/
	
*/
 