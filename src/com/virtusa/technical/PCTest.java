package com.virtusa.technical;

public class PCTest {
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.m1();
		
		Child c = new Child();
		c.m1();
		
		Parent pp = new Child();
		pp.m1();
		
		
	}

}
