package org.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Question6123 {
	public static void main(String[] args) {
		List<Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		int a=l.size();
		System.out.println("List1 :\n"+l);
		System.out.println("\nTotal Elements list 1:\n "+a);
		Integer a2=l.get(2);
		System.out.println("\nValue of 2nd Indexfrom List1 :\n"+a2);
		List<Object>  l1=new LinkedList<Object>();
		l1.add(100);
		l1.add(200);
		l1.add(300);
		l1.add(400);
		l1.add(500);
		l1.add(600);
		l1.add(700);
		System.out.println("\nList 2:\n"+l1);
		int s=l1.size();
		Object a3=l1.get(4);
		System.out.println("\nTotal elements of List2 :\n"+s);
		System.out.println("\nValue of 4th Index from List2:\n "+a3 );
		List<Object> l2=new ArrayList<Object>();
		l2.add(105);
		l2.add(205);
		l2.add(305);
		l2.add(405);
		l2.add(505);
		l2.add(605);
		l2.add(705);
		l2.add(805);
		int s2=l2.size();
		
		System.out.println("\nTotal elements of List3: "+s2);
		Object a4=l2.get(8);
		System.out.println("\nValue of 8th  Index from List3 :"+a4);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
