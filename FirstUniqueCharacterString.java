package com;

import java.util.ArrayList;
import java.util.HashSet;

public class FirstUniqueCharacterString {

	public static void main(String[] args) {
		System.out.println(firstUniqChar("Cc"));

	}
	
	public static int firstUniqChar(String s) {
		
		ArrayList<Character> al = new ArrayList<>();
		HashSet<Character> hs = new HashSet<>();
		for(char c:s.toCharArray())
		{
			if(!al.contains(c))
				al.add(c);
			
			else
			{
				al.remove(al.indexOf(c));
				hs.add(c);
			}
			
		}
		
		for(char c:hs)
		{
			if(al.contains(c))
				al.remove(al.indexOf(c));
		}
		
		if(al.size()>0)
			return s.indexOf(al.get(0));
		
		
	        return -1;
    }

}
