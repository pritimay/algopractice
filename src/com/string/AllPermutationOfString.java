package com.string;

import java.util.HashSet;

//Java program to print all the permutations 
//of the given string 
public class AllPermutationOfString { 

	// Function to print all the permutations of str 
	static void printPermutn(String str, String ans) 
	{ 

		// If string is empty
		HashSet<String> set= new HashSet<String>();
		if (str.length() == 0) { 
			
			if(!set.contains(ans)) {
				set.add(ans);
				System.out.print(set + " "); 
				return;
			}
			 
						
		} 

		for (int i = 0; i < str.length(); i++) { 

			// ith character of str 
			char ch = str.charAt(i); 

			// Rest of the string after excluding 
			// the ith character 
			String ros = str.substring(0, i) + 
						str.substring(i + 1); 

			// Recurvise call 
			printPermutn(ros, ans + ch); 
		} 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		String s = "aaa"; 
		printPermutn(s, ""); 
	} 
} 
