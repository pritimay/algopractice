package com.string;

public class SmallestWindow {

	public static void main(String args[]) {

		String str = "this is a test string";
		String pat = "tist";

		SmallestWindow smallestWindow = new SmallestWindow();
		String str1= smallestWindow.findSmallestWindow(str, pat);
		System.out.println(str1);
	}

	private String findSmallestWindow(String str, String pat) {
		int no_chars = 256;
		if (null == str || null == pat) {
			System.out.println("Do nothing!");
		}
		if (pat.length() > str.length()) {
			System.out.println("pattern not found");
		}
		int hash_pat[] = new int[no_chars];
		int hash_str[] = new int[no_chars];

		int n1 = str.length();
		int n2 = pat.length();

		int count = 0, max_window = Integer.MAX_VALUE;
		int start_index = -1;
		int start = 0;

		for (int i = 0; i < n2; i++) {
			hash_pat[pat.charAt(i)]++;
		}

		for (int j = 0; j < n1; j++) {

			hash_str[str.charAt(j)]++;
			if (hash_pat[str.charAt(j)] != 0 && hash_str[str.charAt(j)] <= hash_pat[str.charAt(j)]) {
				count++;
			}
			if (count == n2) {
				while (hash_pat[str.charAt(start)] == 0
						|| (hash_str[str.charAt(start)] > hash_pat[str.charAt(start)])) {
					if (hash_str[str.charAt(start)] > hash_pat[str.charAt(start)]) {
						hash_str[str.charAt(start)]--;
					}
					start++;
				}

				int window = j - start + 1;
				if (max_window > window) {
					max_window = window;
					start_index = start;
				}
			}

		}
		
		 // If no window found 
        if (start_index == -1) 
        { 
        System.out.println("No such window exists"); 
        return ""; 
        } 
      
        // Return substring starting from start_index 
        // and length min_len 
       
		return str.substring(start_index, start_index+max_window);

	}
}
