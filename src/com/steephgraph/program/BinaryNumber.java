package com.steephgraph.program;

public class BinaryNumber {
	
	public static void main(String[] args) {
		int num=10;
		boolean status=true;
		while(true)
		{
			if(num==0)
				break;
			else
			{
				int temp=num%10;
				if(temp>1)
				{
					status=false;
					break;
				}	
				System.out.println(+num+" "+"No is Binary");
			}
			num=num/10;		
		}
		System.out.println(+num+ " "+"No is not Binary");		
	}
	}
