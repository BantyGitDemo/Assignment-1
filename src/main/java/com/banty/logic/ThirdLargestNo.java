package com.banty.logic;

public class ThirdLargestNo {

	public static void findThirdLargestNo(int[] input) {
		int firstLargest=0;
		int secondLargest=0;;
		int thirdLargest=0;
		
		if(input.length<3) {
			System.out.println("Invalid Input, array size is less than 3");
		}
		else {
		for(int no:input) {
			if(no>firstLargest) {
				firstLargest=no;
			}
		}	
              for(int no1:input) {
			       if(no1<firstLargest && secondLargest<no1) {
			       	secondLargest=no1;
			      }
              }
              for(int no2:input) {
			    if(no2<secondLargest && thirdLargest<no2 ) {
			      thirdLargest=no2;
			
		              }
			}
		System.out.println(thirdLargest);
		}
	}
}
