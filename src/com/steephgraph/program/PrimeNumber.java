package com.steephgraph.program;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		/*int n=1000,sum=0,rem=0;
		int temp=n;
		
		while(temp!=0)*/
		int sum=0;
		for(int i=1;i<=1000;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				 count++;
			}
			if(count==2)
			{
				System.out.println(i);
			
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
