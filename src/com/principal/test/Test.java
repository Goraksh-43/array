package com.principal.test;

public class Test {
	
	static int i=5;
	
	public static void main(String[] args) {
		
	//	byte i=128; it gives compile time error
		
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
		System.out.println(++i+i++);
		
	}

}
