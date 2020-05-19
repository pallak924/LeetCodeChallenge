package com;

import java.util.ArrayList;
import java.util.List;


public abstract class MorganStanley {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(2);al.add(1);al.add(6);al.add(4);
		
		//System.out.println(countBalancingElements(al));
		

	}
	
	static final synchronized protected void m1(){};
	public static int countBalancingElements(List<Integer> arr) {
	    int evensum=0;
	    int oddsum=0;
	    
	    int count=0;
	    int j=0;
	    
	    for(j=0;j<arr.size();j++)
	    {
	   		
			for(int i=0;i<arr.size();i++)
			{
				if(i%2==0)
				{
					evensum=evensum+arr.get(i);
				}else
					oddsum=oddsum+arr.get(i);
			}
			if(evensum==oddsum)
			{
				count++;
			}else
			{
				arr.remove(j);
				j=0;
				
			}
	   
	    }
		

		
		return count;
	    }
}
