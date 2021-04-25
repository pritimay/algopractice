package com.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class UniequeChracter {

	public static void main(String args[]) {

		String str = "eeee";

		int output = GetNumberOfDeletion(str);
		System.out.println(output);

	}

	private static int GetNumberOfDeletion(String str) {
		// TODO Auto-generated method stub

		int deleteDNumber = 0;
		String uniqueArray = str.chars().distinct().mapToObj(c -> String.valueOf((char) c))
				.collect(Collectors.joining());
		List<Integer> list = new ArrayList<>();
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (hm != null && hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
			} else {
				hm.put(str.charAt(i), 1);
			}
		}
		for (int i = 0; i < uniqueArray.length(); i++) {
			int count = hm.get(uniqueArray.charAt(i));
			while (count != 0 && list.contains(count)) {
				count--;
				deleteDNumber++;
			}
			list.add(count);
		}

		return deleteDNumber;

	}
}
