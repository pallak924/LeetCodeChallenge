package com;

public class RemoveKDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(removeKdigits("53327", 2));
	}
	
	public static String removeKdigits(String num, int k) {
		
		if(k==0)
			return num;
		
		
		if(num.length()==k)
			return "0";
		
		StringBuilder sb = new StringBuilder(num);
		
		if(k==1)
		{
			if(num.charAt(0)>num.charAt(num.length()-1))
			{
				sb=sb.deleteCharAt(0);
				if(sb.charAt(0)=='0')
				{
					sb=sb.deleteCharAt(0);
					if(sb.toString().isEmpty())
						return "0";
					else
						return sb.toString();
				}
				else
					return sb.toString();
			}
			else
			{
				sb=sb.deleteCharAt(num.length()-1);
				if(sb.charAt(0)=='0')
				{
					sb=sb.deleteCharAt(0);
					
					if(sb.toString().isEmpty())
						return "0";
					else
						return sb.toString();
				}
				else
					return sb.toString();
			}
				
		}
		
		int count=0;
	    char max = num.charAt(0);
		for(int c=1;c<num.toCharArray().length;c++)
		{
			if(count<k)
			{
			if(num.toCharArray()[c]>max)
			{
				
					char c1 = num.charAt(c);
					max = sb.charAt(c-1);
					sb=sb.deleteCharAt(sb.toString().indexOf(c1));
					count++;
					
					if(count==k)
						return sb.toString();
					
				
			}
			else
			{	
				max = sb.charAt(c);
				continue;
			}	
			}else
			{
				if(sb.charAt(0)=='0')
				{
					sb=sb.deleteCharAt(0);
					if(sb.toString().isEmpty())
						return "0";
					else
						return sb.toString();
				}
				else
					return sb.toString();
			}
				
		}
		
			return null;
	    }

}
