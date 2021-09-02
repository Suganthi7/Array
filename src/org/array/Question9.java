package org.array;

import java.util.ArrayList;
import java.util.List;

public class Question9 {
	public static void main(String[] args) {
		List< Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		l.add(10);
		
		System.out.println("List :"+l);
		int a=l.size();
		System.out.println("Total elemnts:" +a);
		l.set(7, 90);
		System.out.println("\nAfter replacing 7th Index : "+l);
		for (int i = 0; i < l.size(); i++) {
			Integer x=l.get(i);
			if(x==10) {
				l.set(i, 100);
				
				}
			
			if (x==20) {
				l.set(i, 200);
				
			}
			}
		System.out.println("\nAfter relacing 10,20 to 100,200 : "+l);
	}

}