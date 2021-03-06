package com.bridgelabz;

import java.util.Map;
import java.util.Hashtable;

public class HashTableTest {

	public static void main(String[] args) {
		System.out.println("Welcome to  HashTable Program!");
		String string = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations ";
		countFrequency(string);
	}

	public static void countFrequency(String string) {
		Hashtable<String, Integer> hashtable = new Hashtable<>();
		string = string.replace("avoidable", "");
		String arr[] = string.split(" ");

		for (int i = 0; i < arr.length; i++) {

			if (hashtable.containsKey(arr[i])) {
				hashtable.put(arr[i], hashtable.get(arr[i]) + 1);
			} else {
				hashtable.put(arr[i], 1);
			}
		}

		for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
	}
}
