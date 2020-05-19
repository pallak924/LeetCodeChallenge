package com;

import java.util.ArrayList;

import java.util.Collections;

public class SmallerThanCurrentNumber {

	public static void main(String[] args) {
		int[] nums = {8,1,2,2,3};
		int[] result = smallerNumbersThanCurrent(nums);
		for(int i:result)
		System.out.print(i+" ");

	}
	
public static int[] smallerNumbersThanCurrent(int[] nums) {
	
	int[] result = new int[nums.length];
	ArrayList<Integer> al = new ArrayList<>();
	
	for(int i:nums)
		al.add(i);
	
	Collections.sort(al);
	int j=0;
	
	for(int i:nums)
	{
		int index = al.indexOf(i);
		
		result[j]=index;
		j++;
	}
	return result;
        
    }

}
