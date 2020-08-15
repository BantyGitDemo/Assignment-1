package com.banty.logic;

import java.util.HashSet;
import java.util.Set;

public class SumOFUniqueElementLogic {

	  public static void findSumOfUniqueElement(int[] input) {
		  Set<Integer> set=new HashSet<Integer>();
		  int k=0;
		  for(int no:input) {
			  set.add(no);
		  }
		  for(int nos:set) {
			  k=k+nos;
		  }
		  System.out.println("Sum of Unique Number : "+k);
		  System.out.print("Unique element are:");
		  for(int no:set) {
			  System.out.print(no+",");
		  }
	  }
}
