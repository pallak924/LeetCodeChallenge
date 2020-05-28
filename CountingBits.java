package com.leet.Array;

public class CountingBits {

	public static void main(String[] args) {
		int[] result = countBits(5);
		for(int i=0;i<=5;i++)
		{
		System.out.print(result[i] +" ");
		}

	}
public static int[] countBits(int num) {
	
	int[] result=new int[num+1];
	
	
	for(int i=0;i<=num;i++)
	{
		int count=0;
		
		String binary = Integer.toBinaryString(i);
		
		for(char ch:binary.toCharArray())
		{
			if(ch=='1')
				count++;
			
		}
		result[i] = count;
	}
	return result;
        
    }
}
