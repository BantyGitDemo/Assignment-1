package com.banty.logic;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementLogic {

	  public static void removeDuplicateElement(int[] input) {
		Set<Integer> set=new HashSet<Integer>();
		for(int no:input) {
			set.add(no);
		}
		for(int nos:set) {
			System.out.print(nos+",");
		}
	  }
}
