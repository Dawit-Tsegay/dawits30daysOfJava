package com.dawittsegay.calebcurry;

public class nestedForLoop {

	public static void main(String[] args) {
		int i;
		int j;
		for(i = 0; i<=3; i++) {//i  0 1 2 3 4
			for(j = 0; j <=i; j++) {//j 0 1     0 1 2    0 1 2 3   0 1 2 3 4
				System.out.print(j + " ");
			}
			System.out.println("*");
		}
		System.out.println("\n");
		//\n it indicates new line

	}

}


/*
 
public class NestedForLoop {

	public static void main(String[] args) {
	
		//1
		for (int i = 0; i <= 9; i++) {
			for (int k = 0; k <= i ; k++) {
				System.out.print(k + " ");
			}
			System.out.println("a");
		}
		System.out.println("\n");
		
		//2
		int l = 0;
		while (l <= 9) {
			int s = 0;
			while(s <= 9) {
				System.out.print(s + " ");
				s++;
			}
			System.out.println();
			l++;
		}

		System.out.println("\n");
		
		//3
		for (int j = 9; j >= 0; j--) {
			for (l = j; l <= 9; l++) {
				System.out.print(l + " ");
			}
			System.out.println("y");
		}

		System.out.println("\n");
		
		//4
		for (int i = 9; i >= 0; i--) {
			for (int k = i; k >= 0; k--) {
				System.out.print(k + " ");
			}
			System.out.println("x");
		}
		System.out.println("\n");
		
		//5 using while
		l= 9;
		while (l >= 0) {
			int s = l;
			while(s >= 0) {
				System.out.print(s + " ");
				s--;
			}
			System.out.println();
			l--;
		}
		System.out.println("\n");
		
		//6
		for (int i = 0; i <= 9; i++) {
			for (int k = 0; k <= 9; k++) {
				System.out.print(k + " ");
			}
			System.out.println("z");
		}
	}
}




 */
 