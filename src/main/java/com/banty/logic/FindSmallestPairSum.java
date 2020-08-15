package com.banty.logic;

public class FindSmallestPairSum {

	public static void getSmallestPairSum(int [] input) {
		
		int sum=input[0]+input[1];
		
		for(int i=0;i<input.length;i++) {
			for(int j=i+1;j<input.length;j++) {
				if((input[i]+input[j])<sum) {	
					sum=input[i]+input[j];
				}
			}
		}
		System.out.println("The minimum sum :"+sum);
	}
}
