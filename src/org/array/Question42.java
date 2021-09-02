package org.array;

import java.util.LinkedList;
import java.util.List;

public class Question42 {
	public static void main(String[] args) {
		List li=new LinkedList();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		li.add(600);
		li.add(700);
		System.out.println("Linked List : "+li);
		System.out.println(li.size());
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
			
		}
	}

}
