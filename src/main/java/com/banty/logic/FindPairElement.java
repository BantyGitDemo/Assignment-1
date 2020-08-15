package com.banty.logic;

public class FindPairElement {

	public static void getPairElement(int[] input , int sum) {
		
		for(int i=0;i<input.length;i++) {
			for(int j=i+1;j<input.length;j++) {
				if((input[i]+input[j])==sum) {
					System.out.println("pairs with sum "+sum+" are ("+input[i]+","+input[j]+")");
				}
			}
		}
	}
}
