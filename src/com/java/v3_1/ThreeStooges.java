package com.java.v3_1;

import java.util.HashSet;
import java.util.Set;

public final class ThreeStooges {
	private final Set<String> stooges = new HashSet<String>();
	public ThreeStooges(){
		stooges.add("Moe");
		stooges.add("Larry");
		stooges.add("Curly");
	}
	public boolean isStooge(String name){
		return stooges.contains(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeStooges th = new ThreeStooges();
		System.out.println(th.isStooge("Moe"));
		System.out.println(th.isStooge("M"));
		
	}

}
