package com.luxoft.effectivejava.module08.item68;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleExceptionHandlingNew {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.yoursimpledate.server/");
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			String line = reader.readLine();
			SimpleDateFormat format = new SimpleDateFormat("MM/DD/YY");
			Date date = format.parse(line);
		} catch (ParseException | IOException exception) {
			exception.printStackTrace();
		}
	}

}
