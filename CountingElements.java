package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CountingElements {

	public static void main(String[] args) {
		
		int[] arr={1,3,2,3,5,0};
		System.out.println(countElements(arr));
		
	}

	public static int countElements(int[] arr) {
		
		Set<Integer> hs = new HashSet<>();
		
		for(int i:arr)
			hs.add(i);
		
		int count=0;

			for(int i:arr)
			{
				if(hs.contains(i+1))
					count++;
				
		    }
	        
		return count;
	}
}

