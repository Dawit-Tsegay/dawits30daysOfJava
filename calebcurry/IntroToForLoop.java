package com.dawittsegay.calebcurry;

public class IntroToForLoop {

	public static void main(String[] args) {
		
		int i;
		int j;
		
		for(j = 0; j<20; j++) {
			System.out.println("number " + j);
		}
		
									//  0     1        2       3      	4  			5		6			7		8 			9
		String[] tseFam = new String[]{"baba","mama", "winta","bizen", "yohana", "dawit", "hermon", "saliem", "bitanya", "sina"};
		//tseFam.length = 10
		
		//b1m2w3b4y5d6h7s8bi9ti10
		/*
		 * 
		 * while(i <=10){
		 * 
		 * }
		 * */
		/*
		 * for(i = 0; i<=tseFam.length; i++) {//i 0 1 2 3 4 10 11
			System.out.println(i+1 + "," + tseFam[i]);//i0here for the sake of logic i am saying "i + 1"
		}
		System.out.println("no more family members");
		*/
		
		for(i = 0; i<=tseFam.length; i++) {
			System.out.println(i+1 + "," + tseFam[i]);
			
			if( tseFam[i].equals("yohana") ) {
				System.out.println("we found yohana");
				break;
			}
		}
	}

}
