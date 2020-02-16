package com.cjc.logical;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIterate {
	
	public static void main(String[] args) {
		
		
		Map<Integer, String> m=new HashMap<Integer, String>();
		
		m.put(1, "prince");
		m.put(2, "jay");
		
		System.out.println(m);
		
		Set<Integer> s=m.keySet();
		
		System.out.println(s);
		
		/*for (Integer ss : s) {
			
			String val=m.get(ss);
			System.out.println(val);
			
		}*/
		
		Iterator<Integer> itr=s.iterator();
		
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			String val=m.get(integer);
			System.out.println(val);
			
		}
		
	}

}
