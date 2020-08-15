package com.banty.logic;

public class FindMaxAndMin {

	  public static void getMinAndMax(int[] input) {
		  int max=input[0];
		  int min=input[0];
		  for(int no:input) {
			  if(no>max) {
				  max=no;
			  }
		  }
		  for(int no1:input) {
			  if(no1<min) {
				  min=no1;
			  }
		  }
		  System.out.println("Min :"+min+" Max: "+max);
	  }
}
