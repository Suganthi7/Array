package org.array;

public class Sumavg12 {
	public static void main(String[] args) {
		int a[]= {20,30,20,50,10,50,90,60,80,70};
		int sum=0,avg=0;
		for (int i : a) {
			sum+=i;
			
			}
		int l=a.length;
		
		avg=sum/l;
		
		System.out.println("Sum of Value is :"+sum);
		System.out.println("Average of value is :"+avg);
		
	}

}
