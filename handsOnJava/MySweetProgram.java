package com.dawittsegay.handsOnJava;

import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Scanner x = new Scanner(System.in);
		
		String s = x.nextLine();
		int y = 5;
		
		System.out.println(y);
		int i= 0;
		do {
			System.out.println("i is:" + i);
			i++;
		}
		while(i<10);
		x.close();
	}

}
