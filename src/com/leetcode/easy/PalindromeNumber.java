package com.leetcode.easy;

public class PalindromeNumber {

	public static void main(String args[]) {

		int number = 12121;

		checkPalindromeNumber(number);

	}

	private static void checkPalindromeNumber(int number) {

		if (number == 0 || (number % 10 == 0)) {
			System.out.println("Not a palindrome");
			return;
		}

		int reversed = 0;

		while (number > reversed) {
			reversed = reversed * 10 + number % 10;
			number = number / 10;
		}

		boolean isPalindrome = (number == reversed || (number == reversed / 10));
		if (isPalindrome) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a plaindrome");
		}

	}
}
