package com.dawittsegay.calebcurry;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
	/*while directly directs us to the loop till the condition that we specified is fulfilled
	 * 
	 * but do while at least executed one condition first and then directs us to the loop */
		String pass = "dadihani02";
		
		System.out.println("please enter password->");
		Scanner x = new Scanner(System.in);
		
		String pw = x.nextLine();
		
		
		/*while(!pw.equals(pass)) {
			System.out.println("please enter the password again");
			pw = x.nextLine();
		}
		System.out.println("congratulations");*/
		
		
		
		do {
			System.out.println("please enter the password again");//primitive data types (==  int, long char byte boolean )  but literals and classes (.equals  Integer, String, Double, Long,Float)
			pw = x.nextLine();
		}
		while(!pw.equals(pass));
			System.out.println("congratulations");
		
		
		

	}

}






















/*	System.out.println("guess the password");
String passwd = "dawit";
Scanner pw = new Scanner(System.in);
String x = pw.nextLine();
do {
	System.out.println("Guess the password again. don't quit: ");
	x = pw.nextLine();
}while(!x.equals(passwd));
System.out.println("gr8! ");
}*/