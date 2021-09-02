package org.array;

import java.util.ArrayList;
import java.util.List;

public class Question7 {
	public static void main(String[] args) {
		List<Object> l=new ArrayList<Object>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		System.out.println("List :"+l);
		int a=l.size();
		System.out.println("No of elements :"+a);
		l.remove(2);
		System.out.println("After Removing index 2 : "+l);
		
		
	}

}
