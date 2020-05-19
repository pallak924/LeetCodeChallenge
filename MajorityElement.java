package com;

import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1};
		System.out.println(majorityElement(nums));

	}
	public static int majorityElement(int[] nums) {
	        
		int thres = nums.length/2;
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i:nums)
		{
			int count=1;
			
			if(hm.containsKey(i))
			{
				count=hm.get(i);
				count++;
				hm.put(i, count);
				
			}
			else
			{
				
				hm.put(i, count);
				
				
			}
			
			if(count>thres)
				return i;
		}
		return 0;
	    }
}
