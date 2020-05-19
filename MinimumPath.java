package com;

public class MinimumPath {

	public static void main(String[] args) {
		
	}

	public int minPathSum(int[][] grid) {
		
		int sumRight=0;
		int sumDown=0;
	        
	    for(int i=0;i<grid.length;i++)
	    {
	    	for(int j=0;j<grid[i].length;j++)
	    	{
	    		sumRight=grid[i][j]+grid[i][j+1];
	    		sumDown=grid[i][j]+grid[i+1][j];
	    		
	    		if(sumRight<sumDown)
	    		{
	    			
	    		}
	    	}
	    }
		
		
		
		
		
		
		
		
		
		
	
	
		return 0;
	}
	
	
	
}
