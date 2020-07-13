package com.dawittsegay.calebcurry;


public class Abstruct {
/*abstract does not let us instantiate objects from any class
 * and they don't take any body
 * and we have to override it, its must */
	public static void main(String[] args) {
		StudentAbstructClass s = new StudentAbstructClass();
		s.major = "Chemical Engineering";
		System.out.println(s.major);
		
		s.firstName = "dawit";
		s.lastName = "oqubaldet";
		s.sayHello();

	}

}
