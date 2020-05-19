package com;

import java.util.ArrayList;
import java.util.List;

public class ImplementTrie {
	
	List<String> al;

	public static void main(String[] args) {
		ImplementTrie trie = new ImplementTrie();
		trie.insert("apple");
		System.out.println(trie.search("apple"));
		System.out.println(trie.search("app"));
		System.out.println(trie.startsWith("app"));
		trie.insert("app"); 
		System.out.println(trie.search("app"));
	}
	
	 public ImplementTrie() {
		 
		al = new ArrayList<String>();
	        
	    }
	    
	    
	    public void insert(String word) {
	        
	    	al.add(word);
	    }
	    
	    
	    public boolean search(String word) {
	    	
	    	
	    		if(al.contains(word))
	    			return true;
	    	
			return false;
	        
	    }
	    
	   
	    public boolean startsWith(String prefix) {
			
	    	for(String s:al)
	    	{
	    		if(s.startsWith(prefix))
	    			return true;
	    	}
	    	
	    	return false;
	        
	    }

}
