package com;

import java.util.ArrayList;
import java.util.Collections;

public class OnlineStockSpan {

	
	static ArrayList<Integer> al=new ArrayList<>();
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OnlineStockSpan obj = new OnlineStockSpan();
		int[] input={100,80,60,70,60,75,85};
		for(int i:input)
		{
		int param_1 = obj.next(i);
		System.out.print(param_1+" ");
		}

	}
	
	public OnlineStockSpan()
	{
		al=new ArrayList<>();
	}
	
	public int next(int price) {
		int count=1;
		al.add(price);
		
		for(int i=al.size()-1;i>0;i--)
		{
			
			if(al.get(i-1)<price)
			{
				count++;
			}
			else break;
		}
			
		
		
		
		
			return count;   
	    }

}
