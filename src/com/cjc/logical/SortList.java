package com.cjc.logical;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortList {
	
	public static void main(String[] args) {
		
		List<String> l= new ArrayList<>();
		l.add("when");
		l.add("while");
		l.add("hii");
		l.add("hello");
		l.add("hiii");
		/*l.add("B");
		l.add("D");
		l.add("C");
		l.add("E");
*/		
		System.out.println(l);
		
		Set<String> s= new LinkedHashSet<>(l);
		
		for (String string : s) {
			
			System.out.println(string);
			
		}
		
		
		
	}

}
