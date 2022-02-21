package com.luxoft.effectivejava.module06.item42;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class DateRange {
	private final Calendar start;
	private final Calendar end;

	public DateRange(Calendar start, Calendar end) {
		if (start.compareTo(end) > 0)
			throw new IllegalArgumentException(start + " after " + end);
		this.start = start;
		this.end = end;
	}

	// Repaired constructor - makes defensive copies of parameters
	// Stops first attack
//	public DateRange(Calendar start, Calendar end) {
//		this.start = (Calendar) start.clone();
//		this.end = (Calendar) end.clone();
//
//		if (this.start.compareTo(this.end) > 0) {
//			throw new IllegalArgumentException(start + " after " + end);
//		}
//	}

	public Calendar start() {
		return start;
	}

	public Calendar end() {
		return end;
	}

	public String toString() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		String startDate = format.format(start.getTime());
		String endDate = format.format(end.getTime());
		return startDate + " - " + endDate;
	}

}