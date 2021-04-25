package com.string;

public class RemoveCharactersToFormAnagram {

	public static void main(String args[]) {
	
		String str1= "bcaedh";
		String str2 = "aaa";
		
		RemoveCharactersToFormAnagram removeCharactersToFormAnagram= new RemoveCharactersToFormAnagram();
		removeCharactersToFormAnagram.findMinimumNumberOfCharacters(str1, str2);
		
	}

	private void findMinimumNumberOfCharacters(String str1, String str2) {
		
		final int TOTAL_CHARS = 26;
		int count1[] = new int[TOTAL_CHARS];
		int count2[] = new int[TOTAL_CHARS];
		
		for( int i= 0; i < str1.length()-1; i++) {
			count1[str1.charAt(i)-'a']++;
		}
		for( int i= 0; i < str2.length()-1; i++) {
			count2[str2.charAt(i)-'a']++;
		}
		int result= 0;
		for(int i=0 ; i < TOTAL_CHARS; i++) {
			result= result+Math.abs(count1[i]-count2[i]);
		}System.out.println(result);
	}
}
