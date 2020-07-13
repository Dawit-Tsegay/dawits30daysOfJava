package com.dawittsegay.calebcurry;

public class Arrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] grades = new int[10];
		grades[0] = 10;
		System.out.println(grades[0]);

		int[] size = {10, 13, 23, 34, 32};
		System.out.println(size[3]);
		size[3] = 100;
		System.out.println(size[3]);
		//System.out.println(size[10]);//this throws an error
		/*exception a run time error when the code has no idea how to deal with it*/
		try {
			System.out.println(size[10]);//this throws an error
		}catch (Exception e)
		{
			System.out.println(e + "///This is an out bound error dawit");//this is printing an exception error
		}

	}
}