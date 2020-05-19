package com;



public class ProductArrayExceptSelf {

	public static void main(String[] args) {
		int[] nums={1,0};
		int[] result=productExceptSelf(nums);
		for(int i:result)
			System.out.print(i+" ");

	}
	public static int[] productExceptSelf(int[] nums) {
	        
		int[] result=new int[nums.length];
		int product=1;
		int zerocount=0;
		
		
		for(int i:nums)
		{
			if(i==0)
				zerocount++;
			else
			product=product*i;
			
		}
		for(int i=0;i<nums.length;i++)
		{
			
			if(nums[i]==0 && zerocount>1)
			{
				result[i]=0;
				zerocount--;
			}
			else if(nums[i]==0 && zerocount==1)
			{
				result[i]=product;
			}
			else	
				result[i]=product/nums[i];
			
    	}
		return result;
	    }
	

	public static int[] productExceptSelf1(int[] nums) {
		
		int[] result = new int[nums.length];
		
		int product=1;
		
		for(int i=0;i<nums.length;i++)
		{
			product=1;
			for(int k=0;k<nums.length;k++)
			{
				if(i!=k)
					product=product*nums[k];
			}
			
			result[i]=product;
			
		}
		return result;
	}

}