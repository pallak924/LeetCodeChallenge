package com;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findAnagrams("cbaebabacd", "abc"));

	}

	 public static List<Integer> findAnagrams(String s, String p) {
		 
		 ArrayList<Integer> al = new ArrayList<Integer>();
		 char[] s1 = s.toCharArray();
		 char[] p1 = p.toCharArray();
		 Arrays.sort(p1);
		 
		 for(int i=0;i<(s1.length-p1.length)+1;i++)
		 {
			 String str = s.substring(i, i+p1.length);
			 char[] str1 = str.toCharArray();
			 Arrays.sort(str1);
			 
			 if(Arrays.equals(str1, p1))
				 al.add(i);
			
		 }
		 return al;
	        
	 }
	}
