package com.javaGenerics;

public class MaximumInteger {

	public static int maxInteger(int first, int second, int third)                // first,second,third three integers.
	{	
		if (first > second && second > third) {
			return first;
		} else if (second > third) {
			return second;
		} else {
			return third;
		}
	}

   public static void main(String[] args) {
	   
	   System.out.println("Maximum number among 3 is = " + maxInteger(685, 544, 511));
		System.out.println("Maximum number among 3 is = " + maxInteger(1253, 963, 2572));
		System.out.println("Maximum number among 3 is = " + maxInteger(2253, 1999, 999));
	}
}
   