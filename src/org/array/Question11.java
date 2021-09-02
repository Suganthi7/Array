package org.array;

import java.util.ArrayList;
import java.util.List;

public class Question11 {
	public static void main(String[] args) {
		List<Object> l1=new ArrayList<Object>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(90);
		l1.add(10);
		l1.add(10);
		l1.add(40);
		l1.add(50);
	System.out.println("List1: " +l1);
	List<Object> l2=new ArrayList<Object>();
	l2.add(30);
	l2.add(40);
	l2.add(50);
	l2.add(60);
	l2.add(80);
	System.out.println("List2 :"+l2);
	List<Object> l3=new ArrayList<Object>();
	l3.add(10);
	l3.add(20);
	l3.add(60);
	l3.add(50);
	l3.add(40);
	l3.add(70);
	l3.add(80);
	l3.add(90);
	System.out.println("List3 :"+l3);
	l2.removeAll(l1);
	System.out.println("Remove Common values List1 & list2 "+l2);
	l1.removeAll(l3);
	System.out.println("Remove Common values List1 & list3 "+l1);
	
	}
}
