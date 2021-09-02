package org.array;

import java.util.List;
import java.util.Vector;

public class Question645 {
	public static void main(String[] args) {
		List<Object> l=new Vector<Object>();
		l.add(105);
		l.add(205);
		l.add(305);
		l.add(405);
		l.add(505);
		l.add(605);
		l.add(705);
		l.add(805);
		System.out.println("Iterate Using Normal for  Loop");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
			
			
		}
		System.out.println("Iterate Using Enhanced For loop");
		for (Object o : l) {
			
			System.out.println(o);
			
		}
		
		
	}
 
}
