package com.string;

import java.util.Arrays;

public class SmallestWindowContainsAllCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "pritimayapritimaya";
		SmallestWindowContainsAllCharacters smallestWindowContainsAllCharacters= new SmallestWindowContainsAllCharacters();
		smallestWindowContainsAllCharacters.getSmallestWindow(str);
		
	}

	private void getSmallestWindow(String str) {
		// TODO Auto-generated method stub
		int total_Chars= 256;
		int str_length= str.length();
		boolean visited[] = new boolean[total_Chars];
		int distinct_count=0;
		Arrays.fill(visited, false);
		for(int i=0; i < str_length; i++) {
			if(visited[str.charAt(i)]==false) {
				visited[str.charAt(i)]= true;
				distinct_count++;
			}
		}
		
	}

}
