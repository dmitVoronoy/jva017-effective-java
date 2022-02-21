package com.luxoft.effectivejava.module10.item76;

//import java.io.IOException;
//import java.io.InvalidObjectException;
//import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class DateRange implements Serializable {

	private static final long serialVersionUID = -4721031042482880958L;
	private final Calendar start;
	private final Calendar end;

	public DateRange(Calendar start, Calendar end) {
		this.start = (Calendar) start.clone();
		this.end = (Calendar) end.clone();

		if (this.start.compareTo(this.end) > 0) {
			throw new IllegalArgumentException(start + " after " + end);
		}
	}

	public Calendar start() {
		return (Calendar) start.clone();
	}

	public Calendar end() {
		return (Calendar) end.clone();
	}

	public String toString() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		String startDate = format.format(start.getTime());
		String endDate = format.format(end.getTime());
		return startDate + " - " + endDate;
	}

//	private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
//		objectInputStream.defaultReadObject();
//		if (start.compareTo(end) > 0)
//			throw new InvalidObjectException(start + " after " + end);
//	}

}