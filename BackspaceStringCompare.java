package com;

public class BackspaceStringCompare {

	public static void main(String[] args) {
		
		System.out.println(backspaceCompare("ab#c", "ad#c"));
		
		
	
	}
	
public static boolean backspaceCompare(String S, String T) {
		
		while(S.contains("#"))
		{
			int i=S.indexOf("#");
			
			if(i==0)
			{
				StringBuilder sb = new StringBuilder(S);
				S=sb.deleteCharAt(i).toString();
			}
			
			else{
				StringBuilder sb = new StringBuilder(S);
				S=sb.deleteCharAt(i-1).toString();
				
				i=S.indexOf("#");
				S=sb.deleteCharAt(i).toString();
			}
		}
		
		while(T.contains("#"))
		{
			int i=T.indexOf("#");
			
			if(i==0)
			{
				StringBuilder sb = new StringBuilder(T);
				T=sb.deleteCharAt(i).toString();
			}
			
			else{
				StringBuilder sb = new StringBuilder(T);
				T=sb.deleteCharAt(i-1).toString();
				
				i=T.indexOf("#");
				T=sb.deleteCharAt(i).toString();
			}
		}
		
		if(S.equalsIgnoreCase(T))
			return true;
		
	
	return false;
        
	}

}
