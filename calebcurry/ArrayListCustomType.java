package com.dawittsegay.calebcurry;
import java.util.ArrayList;
import java.util.List;

public class ArrayListCustomType {

	public static void main(String[] args) {
		
		GetterClass me = new GetterClass();   //this is an object for a getter class
		me.setFirstName("dawit");
		me.setMiddleName("oqubaldet");
		me.setLastName("tsegay"); 
		GetterClass you = new GetterClass();   //this is an object for a getter class
		you.setFirstName("titina!");
		you.setMiddleName("how you!");
		you.setLastName("amanuel");
		List<GetterClass> users = new ArrayList<GetterClass>();
		users.add(you);
		users.add(me);
		
		System.out.println(users.get(1).getFullName());   //the index "one" indicates the first confirmed object
	}

}