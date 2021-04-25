package com.array;

import java.util.HashMap;
import java.util.Map;

public class MaximumZeroAndOne {

	public static void main(String args[]) {
		int arr[] = { 0, 1, 1, 0, 1, 1, 0, 1 };
		MaximumZeroAndOne maximumZeroAndOne = new MaximumZeroAndOne();
		maximumZeroAndOne.finMaximum(arr, arr.length);

	}

	private void finMaximum(int[] arr, int length) {

		Map<Integer, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < length; i++) {
			arr[i] = (arr[i] == 0) ? -1 : 1;
		}

		int end_index = -1;
		int sum = 0;
		int total_length = 0;
		for (int i = 0; i < length; i++) {
			sum = sum+arr[i];
			if (sum == 0) {
				end_index = i;
				total_length = i + 1;
			}

			if (hashMap.containsKey(sum + length)) {
				if (total_length < i - hashMap.get(sum + length)) {
					total_length = i - hashMap.get(sum + length);
					end_index = i;
				}

			} else {
				hashMap.put(sum + length, i);
			}
		}

		int end = end_index - total_length + 1;
		 System.out.println(end + " to " + end_index); 
		System.out.println(total_length);

	}
}
