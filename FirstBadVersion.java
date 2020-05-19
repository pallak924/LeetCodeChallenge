package com;

public class FirstBadVersion {
	int l=0;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int firstBadVersion(int n) {
		int m=n;
		while(l<=m)
		{
			m=n/2;
			if(isBadVersion(m)==true && isBadVersion(m-1)==true)
			{
				l=0;
				m=m-2;
				firstBadVersion(m-2);
			}
		}
		
	     
			return 0;
	    }
	private boolean isBadVersion(int i) {
		// TODO Auto-generated method stub
		return false;
	}

}
