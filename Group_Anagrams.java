package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagrams {

	public static void main(String[] args) {
		
String[] strs={"eat", "tea", "tan", "ate", "nat", "bat"};
System.out.println(groupAnagrams1(strs));
	}
	
    public static List<List<String>> groupAnagrams1(String[] strs) {
    	
    	List<List<String>> al1 = new ArrayList<>();
    	
    	Map<String,List<String>> hm = new HashMap<>();
    	
    	char[] char_array =null;
    	
    	for(String s:strs)
    	{
    		char_array = s.toCharArray();
    		
    		Arrays.sort(char_array);
    		
    		String sorted = new String(char_array);
    		
    		
    			if(hm.containsKey(sorted))
    			{
    				hm.get(sorted).add(s);
    			}
    			else{
    				List<String> intList = new ArrayList<>();
    				intList.add(s);
    				hm.put(sorted, intList);
    				
    			}
    		
    			
    	}
    	
    	for(String key:hm.keySet())
    		al1.add(hm.get(key));
    	
   	return al1;
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public static List<List<String>> groupAnagrams(String[] strs) {
	
	 List<List<String>> al1 = new ArrayList<>();
		for(int i=0;i<strs.length;i++)
		{
			
			
			char[] char_array = strs[i].toCharArray();
			
			Arrays.sort(char_array);
			
			StringBuffer sb = new StringBuffer();
			for(char c:char_array)
			{
				sb.append(c);
			}
			
				if(al1.isEmpty())
				{
					List<String> al = new ArrayList<>();
					
					al.add(sb.toString());
					al.add(String.valueOf(i));
					
					al1.add(al);
					
					
				}
				else{
					boolean flag=false;
					  try{
						for(List<String> list:al1)
						{
							if(list.contains(sb.toString()))
							{
								list.add(sb.toString());
								list.add(String.valueOf(i));
								flag=true;
								break;
							}
						}
					
							if(flag==false)
							{
								List<String> al = new ArrayList<>();
								al.add(sb.toString());
								al.add(String.valueOf(i));
								al1.add(al);
							}
							
						}
				
				catch (Exception e) {
					
				}
				}
		}
		
		for(List<String> list:al1)
		{
			int[] arr = new int[list.size()/2];
			int j=0;
			for(int i=1;i<list.size();i=i+2)
			{
				
				arr[j]=Integer.parseInt(list.get(i));
				j++;
			}
			
			list.removeAll(list);
			for(int i=0;i<arr.length;i++)
			{
				list.add(strs[arr[i]]);
			}
		}
		
		
		
		
		return al1;        
    }

}
