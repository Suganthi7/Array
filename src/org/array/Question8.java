package org.array;

import java.util.ArrayList;
import java.util.List;

public class Question8 {
	public static void main(String[] args) {
		List<Object> l=new ArrayList<Object>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		int a=l.size();
		System.out.println("List : "+l);
		System.out.println("Total elements : "+a);
		
		l.add(2, 50);
		System.out.println("\nAfter adding 2nd Element :"+l);
		l.add(70);
		System.out.println("\nAfter adding Last Elements :"+l);
		l.add(10, 80);
		System.out.println("\nAfter adding Element 80 in 10 th Index :"+l);
		l.add(11, 100);
		System.out.println("\n\nFinal list : "+l);
	}

}
