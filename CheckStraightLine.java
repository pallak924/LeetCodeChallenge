package com;

public class CheckStraightLine {

	public static void main(String[] args) {
		
//		int[][] coordinates = {{-4,-3},{1,0},{3,-1},{0,-1},{-5,2}};
//		System.out.println(checkStraightLine(coordinates));
		
		System.out.println(isPerfectSquare(4));
		

	}
	
	
public static boolean isPerfectSquare(int num) {
       if(num==1)
    	   return true;
        double temp;

	double sr = num / 2;

	do {
		temp = sr;
		sr = (temp + (num / temp)) / 2;
	} while ((temp - sr) != 0);

       String str =  String.valueOf(sr);
       String dp = str.substring(str.indexOf("."));
        
        if(dp.equals(".0"))
            return true;
        
	return false;
        
    }

	
	public static boolean checkStraightLine(int[][] coordinates) {
	         
		if(coordinates.length==2)
			return true;
		
		double m = 0.0;
		int count=0;
		boolean first=true;
		double previous=0.0;
		for(int i=0;i<coordinates.length-1;i++)
		{
			
			double y = coordinates[i+1][1]-coordinates[i][1];
			double x = coordinates[i+1][0]-coordinates[i][0];
			
			m=y/x;
			
			if(first)
			{
				first=false;
				previous=m;
				continue;
			}
			
			if(previous!=m)
				return false;
			
			previous=m;
			count++;
		}
		if(count==coordinates.length-2)
			return true;
		
			return false;
	    }
}
