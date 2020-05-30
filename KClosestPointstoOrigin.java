package com.leet.matrix;

import java.util.TreeMap;

public class KClosestPointstoOrigin {

	public static void main(String[] args) {
		
		int[][] points = {{0,1},{1,0}};
		int[][] result=kClosest(points, 2);
		
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}
	
public static int[][] kClosest(int[][] points, int K) {
        
		int[][] result=new int[K][2];		
		TreeMap<Integer, int[]> sorted = new TreeMap<>();
		
		for(int[] i : points)
		{
			int distance=(i[0]*i[0])+(i[1]*i[1]);	
			
			if(sorted.containsKey(distance))
			{
				sorted.put(distance,i);
			}
			else{
				sorted.put(distance+1,i);
			}
		}
		int j=0;
		
		for(int i:sorted.keySet())
		{
			if(j==K)
				return result;
			else{
				result[j]=sorted.get(i);
				j++;
				
			}
			
		}
		
		
 			return result;
	}

}
