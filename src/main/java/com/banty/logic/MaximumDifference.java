package com.banty.logic;

public class MaximumDifference {

	public static void findMaxDifference(int[] input) {
		int max=input[0];
		int min=input[0];
		//for max
		for(int no:input) {
			if(no>max) {
				max=no;
			}
		}
	//for min
		for(int no1:input) {
			if(no1<min) {
				min=no1;
			}
		}
		int difference=max-min;
		System.out.println("Maximun difference : "+difference);
	}
}
