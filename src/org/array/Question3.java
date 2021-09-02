package org.array;


import java.util.Set;
import java.util.TreeSet;

public class Question3 {
	public static void main(String[] args) {
		int a[]= {10,10,20,50,60,80,60,50};
		
		System.out.println("array duplicates:");
		for (int i : a) {
			System.out.println(i);
			
		}
		int l=a.length;
		System.out.println("No of values :"+l);
		
		Set<Integer> s=new TreeSet<>();
		
		for (Integer x : a) {
			s.add(x);
			
			
		}
System.out.println("After removing Duplicates using set :  "+s);
	}

}
