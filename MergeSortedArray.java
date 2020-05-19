package com;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1={1,2,3,0,0,0};
		int[] nums2={2,5,6};
		merge(nums1, 3, nums2, 3);
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		
		
		
		
		for(int i:nums2)
		{
			nums1[m]=i;
			m++;
		}
		
		Arrays.sort(nums1);
		
		for(int i=0;i<(m+n);i++)
		{
		System.out.print(nums1[i] +" ");
		}
	        
	    }

}
