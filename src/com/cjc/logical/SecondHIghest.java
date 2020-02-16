package com.cjc.logical;

public class SecondHIghest {
	
	public static void main(String[] args) {
		
		int a[]= {100,50,80,300,10,70,30,200};
		int max=0;
		int secondmax=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				secondmax = max;
				max=a[i];
			}
			
			else if(secondmax<a[i])
			{
				secondmax=a[i];
			}	
			
		}
		
		System.out.println("max :- "+max);
		System.out.println("secondmax :- "+secondmax);
			
	}	

}
