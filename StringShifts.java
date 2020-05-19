package com;

public class StringShifts {

	public static void main(String[] args) {
		int[][] shift = {{1,1},{1,1},{0,2},{1,3}};
			System.out.println(stringShift("abcdefg",shift));
	}
	public static String stringShift(String s, int[][] shift) {
		
		
		
		for(int i=0;i<shift.length;i++)
		{
			int[] b=shift[i];
			if(b[0]==0)
				s=leftrotate(s, b[1]);
			if(b[0]==1)	
				s=rightrotate(s, b[1]);
		}
		
	return s;
	        
	    }
	
		static String leftrotate(String str, int d) 
	    { 
	            String ans = str.substring(d) + str.substring(0, d); 
	            return ans; 
	    } 
	  
	    static String rightrotate(String str, int d) 
	    { 
	            return leftrotate(str, str.length() - d); 
	    } 

}
