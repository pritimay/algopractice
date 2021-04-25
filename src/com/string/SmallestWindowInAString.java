package com.string;

//Java program to find smallest window containing 
//all characters of a pattern. 

public class SmallestWindowInAString {
	static final int no_of_chars = 256;

	// Function to find smallest window containing
	// all characters of 'pat'
	static String findSubString(String str, String pat) {

		int len1 = str.length();
		int len2 = pat.length();

		if (len2 > len1) {
			return null;
		}

		int hash_str[] = new int[no_of_chars];
		int pat_str[] = new int[no_of_chars];
		for (int i = 0; i < len2; i++) {
			pat_str[pat.charAt(i)]++;
		}
		int min_length = 0;
		int count = 0;
		int start = 0;
		int start_index = 0;
		for (int j = 0; j < len1; j++) {
			hash_str[str.charAt(j)]++;
			if (pat_str[str.charAt(j)] != 0 && hash_str[str.charAt(j)] <= pat_str[str.charAt(j)]) {
				count++;
			}
			if (count == len2) {
				while (pat_str[str.charAt(start)] == 0 || hash_str[str.charAt(start)] > pat_str[str.charAt(start)]) {
					if (hash_str[str.charAt(start)] > pat_str[str.charAt(start)]) {
						start++;
					}
				}

				int len_window = j - start + 1;
				if (len_window > min_length) {
					min_length = len_window;
					start_index = start;
				}
			}
		}

		return null;
	}

	// Driver Method
	public static void main(String[] args) {
		String str = "this is a test string";
		String pat = "tist";

		System.out.print("Smallest window is :\n " + findSubString(str, pat));
	}
}
