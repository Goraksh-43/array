package com.clover.infotech;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s="prince";
		int len=s.length();
		System.out.println("Before reverse String = "+s);
		String rev="";
		
		for(int i=len-1;i>=0;i--)
		{
			//System.out.print(s.charAt(i));
			
			rev=rev+s.charAt(i);
		}
		System.out.println("After reverse String = "+rev);
		//System.out.println("Reverse string "+s+" is "+rev);
	}

}
