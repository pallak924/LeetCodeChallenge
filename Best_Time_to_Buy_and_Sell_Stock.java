package com;

public class Best_Time_to_Buy_and_Sell_Stock {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		// TODO Auto-generated method stub
		System.out.println(maxProfit(prices));
	}
	
public static int maxProfit(int[] prices) {
	
	boolean flag=false;
	int profit=0;
	int buy=0;
	
	for(int i=0;i<prices.length-1;i++)
	{
		if(prices[i]<=prices[i+1])
		{
			if(flag==false)
			{   
				buy=i;
				flag=true;
			}
			
			
		}
		else{
			if(flag==true)
			{
				profit=profit+(prices[i]-buy);
				buy=0;
				flag=false;
			}
		}
	}
	
	if(flag==true)
	{
		profit=profit+prices[prices.length-2];
	}
	
	return profit;
    }

}
