package com.luxoft.effectivejava.module07.item59;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
	
	private static void populatePersons(String[] stringArray, Person[] personArray) {
		Random rand = new Random();

		for (int i = 0; i < stringArray.length; i++) {
			personArray[i] = new Person();
			personArray[i].setName(stringArray[i]);
			personArray[i].setAge(rand.nextInt(50) + 1);
		}
	}

	private static void displayPersons(Person[] personArray) {
		for (Person person : personArray) {
			System.out.println(person);
		}
	}
	
	private static double calculateAverageAgeClassicalWay(List<Person> persons) {
		double sum = 0.0;
		int noFilteredPersons = 0;
		for (Person person : persons) {
			if (person.getAge() > 20) {
				sum += person.getAge();
				noFilteredPersons++;
			}
		}
		
		if (noFilteredPersons == 0) 
			return 0;
		
		return sum/noFilteredPersons;
	}
	
	private static double calculateAverageAgeWithStreams(List<Person> persons) {
		return persons.stream()
	           .filter(person -> person.getAge() > 20)
	           .mapToInt(person -> person.getAge())
	           .average()
	           .getAsDouble();
	}
	
	public static void main(String[] args) {
		String[] stringArray = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };

		Person[] personArray = new Person[stringArray.length];
		populatePersons(stringArray, personArray);
		displayPersons(personArray);
		
		System.out.format("Average age calculated classical way: %.2f%n", calculateAverageAgeClassicalWay(Arrays.asList(personArray)));
		System.out.format("Average age calculated with streams: %.2f%n", calculateAverageAgeWithStreams(Arrays.asList(personArray)));

	}

}
