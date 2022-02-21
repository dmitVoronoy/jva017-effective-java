// Broken comparator - can you spot the flaw?
package com.luxoft.effectivejava.module07.item51;

import java.util.Comparator;

public class BrokenComparator {
	public static void main(String[] args) {

		// Broken comparator - can you spot the flaw?
		Comparator<Integer> naturalOrder = new Comparator<Integer>() {
			public int compare(Integer first, Integer second) {
				return first < second ? -1 : (first == second ? 0 : 1);
			}
		};

		int result = naturalOrder.compare(new Integer(42), new Integer(42));
		System.out.println(result);
	}
}
