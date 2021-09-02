package org.array;

import java.util.ArrayList;
import java.util.List;

public class Question41 {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		System.out.println("Array List : "+li);
		System.out.println(li.size());
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
			
		}
	}

}
