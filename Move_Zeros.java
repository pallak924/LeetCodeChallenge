package com;

public class Move_Zeros {

	public static void main(String[] args) {
	int[] nums = {1,1,2};
//		moveZeroes(nums);
	System.out.println(removeDuplicates(nums));
		

	}
	
public static int removeDuplicates(int[] nums) {
        
        int count=0;
        
        for(int i=0;i<nums.length;i++)
        {
        		outloop:
                for(int j=i+2;j<nums.length;j++)
                {
                	
                		while(nums[i+1]!=nums[j])
                		{
                			nums[i+1]=nums[j];
                			break outloop;
                		}
                	
                	}
                	
                }
                
           
      return nums.length-count;
   }
	
public static int hammingDistance(int x, int y) {
	
	
	int x_length=Integer.toBinaryString(x).length();
	int y_length=Integer.toBinaryString(y).length();
	
	String x_binary=Integer.toBinaryString(x);
	String y_binary=Integer.toBinaryString(y);
	if(x_length==y_length)
	{
		int count=0;
		for(int i=0;i<x_binary.length();i++)
		{
			
				if(x_binary.charAt(i)==y_binary.charAt(i))
				{
					
				}
				else
				{
					count++;
					
				}
			
		}
		return count;
	}
	if(x_length>y_length)
	{
		int count=0;
		String pad="%0"+(x_length)+"d";
		System.out.println("pad is "+pad);
		String padded=String.format(pad, Integer.parseInt(Integer.toBinaryString(y)));
		System.out.println("padded is "+padded);
		
		for(int i=0;i<x_binary.length();i++)
		{
			
				if(x_binary.charAt(i)==padded.charAt(i))
				{
					
				}
				else
				{
					count++;
					
				}
			
		}
		return count;
	}
	
	if(y_length>x_length)
	{
		int count=0;
		String pad="%0"+(y_length)+"d";
		System.out.println("PAD is "+pad);
		String padded=String.format(pad, Integer.parseInt(Integer.toBinaryString(x)));
		System.out.println("Padded is "+padded);
		
		for(int i=0;i<y_binary.length();i++)
		{
			
				if(padded.charAt(i)==y_binary.charAt(i))
				{
					
				}
				else
				{
					count++;
					
				}
			}
		return count;
	}
	
	
	
	
	return 0;
        
    }
	
public static void moveZeroes(int[] nums) {
        
	
	
	for(int i=0;i<nums.length;i++)
	{
		if(nums[i]==0)
		{
			
			int j=i;
			int flag=0;
			
	try{
		whileloop:
		while(flag==0)
		{
				while(nums[j+1]!=0)
				{
					flag++;
					nums[i]=nums[j+1];
					nums[j+1]=0;
					break whileloop;
								
				}
				j++;
		}
				
	}catch (Exception e) {
				
			     }
				
			
		}
			
	}
	
	for(int i=0;i<nums.length;i++)
	{
		System.out.print(nums[i]+" ");
	}
	
	
	
    }

}
