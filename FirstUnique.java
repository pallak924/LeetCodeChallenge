package com;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class FirstUnique {
	
	LinkedHashSet<Integer> queue;
	HashSet<Integer> duplicate;

	public static void main(String[] args) {
		
		int[] nums={2,3,5};
		FirstUnique obj = new FirstUnique(nums);
		System.out.println(obj.showFirstUnique());
		obj.add(2);
		System.out.println(obj.showFirstUnique());
		obj.add(2);
		System.out.println(obj.showFirstUnique());

		
		

	}
	public FirstUnique(int[] nums) {
		
		queue = new LinkedHashSet<>();
		duplicate=new HashSet<>();
		for(int i:nums)
		{
			if(queue.contains(i))
				duplicate.add(i);
			else
				queue.add(i);
				
		}
		
			for(int i:duplicate)
			{
				if(queue.contains(i))
					queue.remove(i);
			}
		
    }
    
    public int showFirstUnique() {
		
    	
    	Iterator<Integer> itr = queue.iterator();
		if(itr.hasNext()){
			return itr.next();
		}
    	    
		return -1;
        
    }
    
    public void add(int value) {
    	
    	if(queue.contains(value))
    	{
    		duplicate.add(value);
    		queue.remove(value);
    	}else
    	{
    		if(!duplicate.contains(value))
    				queue.add(value);
    	}
    	
    }

}
