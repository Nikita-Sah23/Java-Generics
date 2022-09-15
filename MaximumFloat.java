package com.javaGenerics;

public class MaximumFloat {
	
	public static double maxiumOfFloat(double first, double second, double third)   // Three floats.
	{
		if (first > second && first > third) {
			return first;
		} else if (second > third) {
			return second;
		} else {
			return third;
		}
	}

	public static void main(String[] args) {
		System.out.println("Maximum number among 3 is = " + maxiumOfFloat(78.9, 48.8, 159.9));
		System.out.println("Maximum number among 3 is = " + maxiumOfFloat(13.2, 28.5, 32.8));
		System.out.println("Maximum number among 3 is = " + maxiumOfFloat(03.9, 14.8, 39.9));
	}
}
