package com;

public class WordsFormedByCharacters {

	public static void main(String[] args) {

		String[] words = {"hello","world","leetcode"};
		String chars = "welldonehoneyr";
		System.out.println(countCharacters(words, chars));

	}
	
	public static int countCharacters(String[] words, String chars) {
	    char[] c1 = chars.toCharArray();
		int return_count=0;
		
		for(String s:words)
		{
			int count=0;
			char[] c = s.toCharArray();
			
			for(char ch:c)
			{
				forloop:
				for(char chr:c1)
				{
					if(ch==chr)
					{
						count++;
						break forloop;
						
					}	
				}
					
			}
			if(count==s.length())
			{
				return_count=return_count+count;
				
			}
		}
			return return_count;
	    }

}
