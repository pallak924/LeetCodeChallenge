package com;

import java.util.ArrayList;
import java.util.Collections;

public class LuckyInteger {

	public static void main(String[] args) {
		int[] num = {1,2,2,3,3,3};
		System.out.println(findLucky(num));

	}
	public static int findLucky(int[] arr) {
	        
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i:arr)
			al.add(i);
		
		for(int i:al)
		{
			int frequency=Collections.frequency(al, i);
			if(frequency==i)
				al1.add(i);
			
		}
		
			if(al1.size()>1)	
			{
					Collections.sort(al1);
					return al1.get(al1.size()-1);
			}
			
			else if(al1.size()==1)
					return al1.get(0);
			
			else
				return -1;
		
	    }

}
