package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumStartValue {

	public static void main(String[] args) {
		
		String s1="abc";
		String s2=s1;
		s1+="d";
		System.out.println(s1+" "+s2+" "+(s1==s2));

	}
	
	 public static int minX(List<Integer> al) {
		    
		 ArrayList<Integer> al1 = new ArrayList<>();
		 for(int i:al)
			 al1.add(i);
		
		 Collections.sort(al1);
		 int x=al1.get(al1.size()-1);
		 
		 
		 for(int i=x;i<100;i++)
		 {
			 x=i;
			 int count=0;
			 forloop:
			 for(int j:al)
			 {
				 
				 x=x+j;
				 if(x>0)
				 {
					 count++;
					 continue forloop;
				 }
				 else 
					 {
					 	break forloop;
					 }
					 
			 }
		 		if(count==al.size())
		 			return i;
		 }

		 
		 
		 
		 
		 return 0;
		    }

}
