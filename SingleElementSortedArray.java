
package com;



public class SingleElementSortedArray {

	public static void main(String[] args) {
		
		int[] nums = {1,1,2};
		System.out.println(singleNonDuplicate(nums));

	}
	
	public static int singleNonDuplicate(int[] nums) {
	        
		for(int i=0;i<nums.length;i=i+2)
		{
			try{
			if(nums[i]!=nums[i+1])
				return nums[i];
			}catch(Exception e)
			{
				return nums[i];
			}
		}
			return 0;
	    }

}
