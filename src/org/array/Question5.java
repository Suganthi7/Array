package org.array;

import java.util.ArrayList;

import java.util.List;


public class Question5 {
	public static void main(String[] args) {
		List<Integer> li =new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		int a=li.indexOf(10);
		System.out.println(li);
		System.out.println("Index Value of 10  from List A "+a);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		int b=li.lastIndexOf(10);
		System.out.println(li);
		System.out.println("last index value of 10 : "+b);
		int c=li.indexOf(50);
		System.out.println("Index value of 50 : "+c);
		int d=li.indexOf(90);
		System.out.println("Index value of 90 : "+d);
		System.out.println("Fetching all position of 10 ");
		for (int i = 0; i <li.size(); i++) {
			Integer x=li.get(i);
			if (x==10) {
				
				System.out.println(i);
			}
			
			
		}
		System.out.println("Fetching all position of 70 ");
		for (int j= 0; j <li.size(); j++) {
			Integer y=li.get(j);
			if (y==70) {
				
				System.out.println(j);
			}
			
			
		}
		
		
		 
	}

}
