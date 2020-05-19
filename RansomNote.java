package com;

import java.util.ArrayList;

public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canConstruct("aa", "ab"));

	}
	public static boolean canConstruct(String ransomNote, String magazine) {
		
		
		int count=0;
		
		StringBuilder sb = new StringBuilder(magazine);
		for(char c:ransomNote.toCharArray())
		{
			int index = sb.indexOf(Character.toString(c));
			if(index!=-1)
			{
				count++;
				sb.deleteCharAt(index);
			}
			else return false;
		}
		
		if(count==ransomNote.length())
			return true;
		else
			return false;
	    }

}
