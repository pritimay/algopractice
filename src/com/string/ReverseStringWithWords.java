package com.string;

public class ReverseStringWithWords {

	
	public static void main(String args[]) {
		
		String str= "Foo is the only program i know";
		ReverseStringWithWords reverseStringWithWords = new ReverseStringWithWords();
		reverseStringWithWords.getReversedString(str);
		
	}

	private void getReversedString(String str) {
	
	
		int i = str.length()-1;
		int start, end= str.length();
		String result= "";
		while(i > 0) {
			if(str.charAt(i) == ' ') {
				start = i;
				while(start < end) {
					result+=str.charAt(start);
					start++;
					
				}
				result+=" ";
				end=i;
			}
			i--;
		}
		
		
		
	}
}
