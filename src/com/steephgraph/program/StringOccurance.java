package com.steephgraph.program;

public class StringOccurance {
	
	public static void main(String[] args) {
		
		String s="steephgraph";
		
		char a[]=s.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]='\0';
				}
				
			}
			
			if(a[i]!='\0')
			{
				System.out.println(" occurances of " +a[i]+" " +count);
			}
		}
	}

}
