/**
 * 
 */
package com.string;


import java.util.ArrayList;
import java.util.List;
/**
 * @author pritimaya
 *
 */
public class CheckIfPalidromeExists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str= "madamm";
		CheckIfPalidromeExists checkIfPalidromeExists= new CheckIfPalidromeExists();
		checkIfPalidromeExists.checkPalindrome(str);
		
		

	}

	private void checkPalindrome(String str) {
		
		List<Character> charList= new ArrayList<>();
		for(int i=0; i < str.length(); i++) {
			char c= str.charAt(i);
			if(charList.contains((Character)c)) {
				charList.remove((Character)c);
			}
			else {
				charList.add((Character)c);
			}
			
		}
		if((str.length() %2 ==0 && charList.size()== 0 ) || ( str.length() %2 ==1 && charList.size() ==1)) {
			System.out.println("palindrome exists");
		}else {
			System.out.println("Palindrome does not exists");
		}
		
	}

}
