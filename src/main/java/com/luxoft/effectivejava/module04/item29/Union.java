package com.luxoft.effectivejava.module04.item29;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Union {

	// Uses raw types unacceptable!
	public static Set union(Set s1, Set s2) {
		Set result = new HashSet(s1);
		result.addAll(s2);
		return result;
	}

	// Simple program to exercise generic method
	public static void main(String[] args) {
		Set<String> guys = new HashSet<String>(Arrays.asList("Tom", "Richard", "Harry"));
		Set<String> girls = new HashSet<String>(Arrays.asList("Laura", "Patty", "Denise"));
		Set<String> all = union(guys, girls);
		System.out.println(all);
	}
}
