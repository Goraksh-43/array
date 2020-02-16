package com.sydac.simulation;

public class Test2 {
	
	private static void replace(String st,String t,String r)
	{
		st.replace(t, r);
	}
	
	private static void replace(StringBuilder sb,int s,int e,String r)
	{
		sb.replace(s, e, r);
	}
	
	public static void main(String[] args) {
		
		String str1="xava";
		StringBuilder str2=new StringBuilder(" xm");
		replace(str1, "x", "j");
		replace(str2, 1, 2, "v");
		System.out.println(str1 + str2);
	}

}
