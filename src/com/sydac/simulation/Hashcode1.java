package com.sydac.simulation;

public class Hashcode1 {
	
	public static void main(String[] args) {
		
		Object ob = new Object()
				{
					public int hashcode()
					{
						return 42;
					}
			
				};
				
				System.out.println(ob.hashCode());
		
	}

}
