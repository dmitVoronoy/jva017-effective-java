package com.luxoft.effectivejava.module08.item62;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionsDemo {

	public static void checkedExceptionTest(String fileName) {
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(fileName);
			System.out.format("File input stream created: %s%n", fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		checkedExceptionTest("src/main/resources/testFile.txt");
		checkedExceptionTest("src/main/resources/testFile2.txt");
	}

}
