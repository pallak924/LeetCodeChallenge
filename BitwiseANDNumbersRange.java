package com;

public class BitwiseANDNumbersRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(rangeBitwiseAnd(0,1));
	}
	
	public static int rangeBitwiseAnd(int m, int n) {
		
		int sum = m;
		
		for(int i=m+1;i<=n;i++)
			sum=sum & i;
		
		return sum;
	        
	    }

}
