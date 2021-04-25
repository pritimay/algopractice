package com.string;

public class LongestSubsequenceWithKCharacters {

	public static void main(String arg[]) {
		
		LongestSubsequenceWithKCharacters longestSubsequenceWithKCharacters = new LongestSubsequenceWithKCharacters();
		String str =  "india";
		//longestSubsequenceWithKCharacters.getSubsequence(str,2);
		longestSubsequenceWithKCharacters.getAllRotation(str);
	}

	private void getAllRotation(String str) {
		int length= str.length();
		while(length > 0) {
			String modifiedString= str.substring(1)+str.substring(0, 1);
			System.out.println(modifiedString);
			str= modifiedString;
			length--;
		}
		
		
		
		
		
	}

	private void getSubsequence(String str, int k) {
	 
			int max_Chars = 26; 
			
			int frequecny[] = new int[max_Chars];
			
			for(int i=0 ; i < str.length() ; i++) {
				frequecny[str.charAt(i)-'a']++;
			}
			
			for(int i =0; i < str.length(); i++) {
				
				if(frequecny[str.charAt(i)-'a'] >= k)
				{
					System.out.println(str.charAt(i));
				}
				
			}
			
		
		
		
	}
	
	
}
