package com.string;

public class StringInReverseOrder {

	public static void main(String args[]) {

		String str = "I am geek";
		StringInReverseOrder stringInReverseOrder = new StringInReverseOrder();
		stringInReverseOrder.printInReverseOrder(str);

	}

	private void printInReverseOrder(String str) {

		int i = str.length() - 1;
		String result = "";
		int end = str.length();
		int start= 0;
		while (i >= 0) {
			if (str.charAt(i) == ' ') {
				start = i + 1;
				while (end != start) {
					result += str.charAt(start);
					start++;
				}
				result += ' ';
				end = i;
			}
			i--;
		}
		start = 0;
		while(start!=end) {
			result += str.charAt(start++);
		}
		
		
		
		
		
		System.out.println("Reversed String: \n"+result);
	}
}
