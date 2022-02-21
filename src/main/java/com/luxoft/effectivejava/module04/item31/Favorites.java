// Typesafe heterogeneous container
package com.luxoft.effectivejava.module04.item31;

import java.util.HashMap;
import java.util.Map;

public class Favorites {
	private static Map<Class<?>, Object> favorites = new HashMap<Class<?>, Object>();

	public static <T> void putFavorite(Class<T> type, T instance) {
		if (type == null) {
			throw new NullPointerException("Type is null");
		}
		favorites.put(type, instance);
	}

	public static <T> T getFavorite(Class<T> type) {
		return type.cast(favorites.get(type));
	}

	// Typesafe heterogeneous container pattern - client
	public static void main(String[] args) {
		putFavorite(String.class, "Java");
		putFavorite(Integer.class, 0xcafebabe);
		putFavorite(Class.class, Favorites.class);

		String favoriteString = getFavorite(String.class);
		int favoriteInteger = getFavorite(Integer.class);
		Class<?> favoriteClass = getFavorite(Class.class);
		System.out.printf("%s %x %s%n", favoriteString, favoriteInteger, favoriteClass.getName());
			}
}