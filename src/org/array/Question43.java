package org.array;

import java.util.List;
import java.util.Vector;

public class Question43 {
	public static void main(String[] args) {
		List li=new Vector();
		li.add(105);
		li.add(205);
		li.add(305);
		li.add(405);
		li.add(505);
		li.add(605);
		li.add(705);
		li.add(805);
		System.out.println("Vector List: "+li);
		System.out.println(li.size());
		for (int i = 0; i <li.size(); i++) {
			System.out.println(li.get(i));
			
		}
		
	}

}
