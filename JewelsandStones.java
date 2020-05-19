package com;

public class JewelsandStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(numJewelsInStones("z", "ZZ"));

	}
	
	public static int numJewelsInStones(String J, String S) {
       
		int count=0;
		for(char i:J.toCharArray())
		{
			for(char c : S.toCharArray())
				if(i==c)
					count++;
		}
			
		
		
		return count;
    }

}
