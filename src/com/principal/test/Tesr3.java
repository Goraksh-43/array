package com.principal.test;

import java.util.TreeSet;

public class Tesr3 {
	
	public static void main(String[] args) {
		
		
		TreeSet<String> t = new TreeSet<>();
		t.add("one");
		t.add("two");
		t.add("three");
		t.add("one");
		
		System.out.println(t);
	}

}
