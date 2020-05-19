package com;

public class NumberComplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findComplement(1));

	}
	
public static int findComplement(int num) {
	
	String binary = Integer.toBinaryString(num);
	//StringBuilder sb = new StringBuilder();
	String str="";
	
	for(char s : binary.toCharArray())
	{
		if(s=='0')
			str+='1';
		else
			str+='0';
	}
	int decimal=Integer.parseInt(str,2);
	return decimal;
    }

}
