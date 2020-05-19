package com;


import java.util.Stack;


public class ValidParenthesis {

	public static void main(String[] args) {
		String s = "(())((())()()(*)(*()(())())())()()((()())((()))(*";
		System.out.println(checkValidString(s));
		
	}
	public static boolean checkValidString(String s) {
		
		
		Stack<Character> stck = new Stack<>();
		int count=0;
		int k=0;
		boolean flag=false;
		
		for(char i:s.toCharArray())
		{
			
			if(i=='*')
			{
				count++;
				flag=true;
			}
			
			else if(i=='(')
				stck.push(i);
			else if(i==')')
				if(!stck.isEmpty())
					stck.pop();
				else
					break;
				
			k++;
		}
	if(k==s.toCharArray().length)	
	{
		if(stck.isEmpty())
			return true;
		else{
			 if(count>0 && stck.size()<=count)
				{
					return true;
				}
			 else return false;
		}
	}
		
	else
		for(int j=k;j<s.toCharArray().length;j++)
		{
			if(count>0 && s.toCharArray()[j]==')')
			{
				count--;
			}
			else if(count>0 && s.toCharArray()[j]=='(')
			{
				count--;
			}
		
				
		}
	if(count==0 && flag==true)
		return true;
	else return false;

	    }

}
