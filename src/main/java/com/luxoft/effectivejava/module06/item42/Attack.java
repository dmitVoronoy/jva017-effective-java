// Two attacks on the internals of an "immutable" period
package com.luxoft.effectivejava.module06.item42;

import java.util.Calendar;

public class Attack {
	public static void main(String[] args) {
		// Attack the internals of a Period instance
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		DateRange range = new DateRange(start, end);
		end.set(Calendar.YEAR, 2015);
		end.set(Calendar.MONTH, 4);
		end.set(Calendar.DATE, 28);
		System.out.println(range);

		// Second attack on the internals of a DateRange instance
		start = Calendar.getInstance();
		end = Calendar.getInstance();
		range = new DateRange(start, end);
		range.end().set(Calendar.YEAR, 2015);
		range.end().set(Calendar.MONTH, 4);
		range.end().set(Calendar.DATE, 28);
		System.out.println(range);
	}
}
