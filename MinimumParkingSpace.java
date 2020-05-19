package com;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumParkingSpace {

	public static void main(String[] args) {

		
//		int[][] parkingtime={{5,10},{0,20},{25,40},{35,45}};
//		System.out.println(minParkingSpaces(parkingtime));
		
		int[] nums={0,0,0,0,0,0,0,0,0,0};
				
		int k=0;
		
		System.out.println(subarraySum(nums, k));

	}

public static int subarraySum(int[] nums, int k) {
        
        int sum=0;
        int count=0;
       
 
        for(int i=0;i<nums.length;i++)
        {
            sum=0;
            
            forloop:
            for(int j=i;j<nums.length;j++)
            {
                sum=sum+nums[j];
                if(sum==k)
                {
                    count++;
                    //break forloop;
                }        
            }
        }
        return count;
    }
   
                                                                                
	static int minParkingSpaces(int[][] parkingStartEndTimes) {
        
		int starttime=0;
		int endtime=0;
		int starttime1=0;
		int endtime1=0;
		int space=1;
		
		for(int i=0;i<parkingStartEndTimes.length;i++)
		{
			
				starttime=parkingStartEndTimes[i][0];
				endtime=parkingStartEndTimes[i][1];
			
				for(int j=i+1;j<parkingStartEndTimes.length;j++)
				{
					starttime1=parkingStartEndTimes[j][0];
					endtime1=parkingStartEndTimes[j][1];
					
					
					if(starttime1>=starttime && starttime1<=endtime)
						space++;
					
					
				}
		}
		
		return space;
	}

}
