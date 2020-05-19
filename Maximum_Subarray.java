package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Maximum_Subarray {

	public static void main(String[] args) {
		
		int[] nums={4,1,2,1,2};
//		int max_sum=maxSubArray(nums);
//		System.out.println(max_sum);
		
//		int i=11;
//		System.out.println(isHappy(14));
		
		System.out.println(singleNumber(nums));
		
		
	}
	
public static int maxSubArray(int[] nums) {
		ArrayList<Integer> al = new ArrayList<>();
		for(int i:nums)		
			al.add(i);
		
		Collections.sort(al);
		
        int max_sum=al.get(al.size()-1);
                
        for(int i=0;i<nums.length;i++)
        {
        	int sum=0;
        	for(int j=i+1;j<nums.length;j++)
        	{
        		if(j==i+1) sum=nums[i]+nums[j];
        		
         		else sum=sum+nums[j];
        		if(sum>max_sum) max_sum=sum;
        	}
        }
        return max_sum;
        
    }
public static boolean isHappy(int n) {   
    int a,sum=0;    
    if(n==1 || n==7)
    	return true;
    if(n>=0 && n<=9)
		return false;
    else{
    	do{
    	while(n>0)
    	{
    		a=n%10;
    		sum=(int) (sum+Math.pow(a, 2));
    		n=n/10;
    	}	
			if(sum==1 || sum==7)
				return true;
			if(sum>=0 && sum<=9)
				return false;
			else{
				n=sum;
				sum=0;
			}
		   }while(sum!=1);
    	}	
	return false;
}

public static int singleNumber(int[] nums) {
	List<Integer> al = new ArrayList<>();
	boolean flag=false;
	
	for(int i=0;i<nums.length;i++)
	{
		
		
		if(!al.contains(nums[i]))
		{
			flag = false;
			
			forloop:
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
				{
					flag=true;
					al.add(nums[i]);
					break forloop;
				}
			}
		}
		if(flag==false)
			return nums[i];
	}
	return 0;
	
	
    
}

public static int singleNumber1(int[] nums) {
	
	int duplicate=0;
	
	outerloop:
	for(int i=0;i<nums.length;i++)
	{
		int flag=0;
		if(nums[i]!=duplicate)
		{
		
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
				{
					flag++;
					duplicate=nums[i];
					break outerloop;
				}
			}
			if(flag==0)
				return nums[i];
		}
	}
return 0;
}
}


