package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Testing {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Map<String, List<Integer>> map = new LinkedHashMap<>();
		String arr[] = { "One,Two,Three,One" };
		List<Integer> numbers = new ArrayList<>(Arrays.asList(4, 2, 3, 6, 5));
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {

			} else {
				map.put(arr[i], numbers);
			}
		}

		if (null != numbers) {

		}
	}
}