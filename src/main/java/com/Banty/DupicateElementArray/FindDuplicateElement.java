package com.Banty.DupicateElementArray;

import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please Enter the Array Length");
		Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        
        Integer[] input=new Integer[length];
        
        System.out.println("Please enter array elements");
        for (int i = 0; i < length; i++) { 
        	int userInput = sc.nextInt(); 
        	input[i] = userInput; 
        	}
			/*
			 * for (int i = 0; i < length; i++) { System.out.println(input[i]); }
			 */
        
        HashSet<Integer> set=new HashSet<Integer>();
        for(int element:input) {
        	if(!set.add(element)) {
        		System.out.println("Duplicate Element : "+element);
        	}
        }
	}

}
