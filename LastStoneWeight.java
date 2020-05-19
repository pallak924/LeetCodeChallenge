package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class LastStoneWeight {

	public static void main(String[] args) {
		
		int[] stones={2,7,4,1,8,1};
		List<int[]> al=Arrays.asList(stones);
		
		System.out.println(al.size());

	}
	
	public static int lastStoneWeight(int[] stones) {
		
	ArrayList<Integer> al = new ArrayList<>();
		for(int i:stones)
			al.add(i);
		
		Arrays.asList(stones);
		
		Collections.sort(al);
	
		
	while(al.size()!=1)
	{
		
		if(al.get(al.size()-1)==al.get(al.size()-2))
		{
			al.remove(al.size()-1);
			al.remove(al.size()-1);
			al.add(al.size(), 0);
			Collections.sort(al);
		}
		else
		{
			int diff=al.get(al.size()-1)-al.get(al.size()-2);
			al.remove(al.size()-1);
			al.remove(al.size()-1);
			al.add(al.size(), diff);
			Collections.sort(al);
		}
		}

	return al.get(0);
	        
    }

}
