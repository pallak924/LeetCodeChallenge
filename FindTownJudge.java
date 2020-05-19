package com;

import java.util.ArrayList;
import java.util.HashMap;

public class FindTownJudge {

	public static void main(String[] args) {
		
		int[][] trust = {{1,3},{1,4},{2,3},{2,4},{4,3}};
		System.out.println(findJudge(4,trust));

	}
	
public static int findJudge(int N, int[][] trust) {
	
	if(N==1)
		return 1;
	
	HashMap<Integer,Integer> hm = new HashMap<>();
	ArrayList<Integer> al1 = new ArrayList<>();
	
	int count=0;
	for(int[] i:trust)
	{
		al1.add(i[0]);
		if(hm.containsKey(i[1]))
		{
			count=hm.get(i[1])+1;
			hm.put(i[1], count);
		}
		else
			hm.put(i[1], 1);
	}
	
	for(int i:hm.keySet())
	{
		if(hm.get(i)==N-1 && !al1.contains(i))
			return i;
			
	}
	return -1;
        
    }

}
