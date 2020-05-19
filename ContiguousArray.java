package com;

import java.util.ArrayList;


public class ContiguousArray {

	public static void main(String[] args) {
		
		int[] nums={1,1,0,0};

		System.out.println(findMaxLength(nums));
		
	}
	public static int findMaxLength(int[] nums) {
	        
	        int max_count=0;
	        ArrayList<Integer> al=null;
	        int zeroCount;
	        int oneCount;
	        
	       for(int k=0;k<nums.length;k++)
	       {
	    	    al=new ArrayList<>();
		        zeroCount=0;
		        oneCount=0;
		        
		        for(int j=k;j<nums.length;j++)
		        {
		        	
		        	al.add(nums[j]);
		        	
		        	if(nums[j]==0)
		        		zeroCount++;
		        	
		        	else
		        		oneCount++;
		        	
		        	
		        	if(zeroCount==oneCount && max_count<al.size())
		        		max_count=al.size();
		        		
		        }
	      
	       }    
	       return max_count; 
	    }
	
	
	}

