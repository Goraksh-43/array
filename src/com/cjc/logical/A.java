package com.cjc.logical;

class B {
	static
	{
		System.out.println("A");
	}

}
	public class A
	{
		B a = new B();
		public static void main(String[] args) {
			
			System.out.println("main method");
			
			
		}
		static
		{
			System.out.println("main stats");
			
		}
		
	}

