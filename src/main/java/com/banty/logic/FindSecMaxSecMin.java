package com.banty.logic;

public class FindSecMaxSecMin {

	  public static void getSecMaxAndSecMin(int[] input) {
		  
		  int max=input[0];
		  int min=input[0];
		  int secondMax=0;
		  
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
		  for(int no2:input) {
			  if(no2<max && secondMax<no2) {
				  secondMax=no2;
			  }
		  }
		  
		  int secondMin=max;
		  int first=max;
		  for(int no3:input) {
			  if(no3<first) {
				 
				  secondMin=first;
				  first=no3;
			  }
			  else if(no3<secondMin && no3!=first) {
				  secondMin=no3;
			  }
		  }
		  System.out.println("Second Min -"+secondMin+" Second Max -"+secondMax);
	  }
}
