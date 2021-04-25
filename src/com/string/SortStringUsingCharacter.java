package com.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortStringUsingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="pritimaya";
		SortStringUsingCharacter sortStringUsingCharacter= new SortStringUsingCharacter();
		//sortStringUsingCharacter.getSortedString(str);
		//sortStringUsingCharacter.getshiftvalues(str);
		int nums[] = {1,1,1,2,2,3}, k = 2;
		sortStringUsingCharacter.topKFrequent(nums, k);
	}

	private void getshiftvalues(String str) {

			System.out.println( 0 & (1 << 15));
			System.out.println( 0 | 32768);
			System.out.println(32768 & 1 << 17);
			System.out.println(32768 & 0);
	}

	private void getSortedString(String str) {
		String newStr="";
		for(int i ='a'; i < 'z'; i++ ) {
			for(int j=0; j < str.length(); j++) {
				if(i==str.charAt(j)) {
					newStr+=str.charAt(j);
				}
			}
		}
	 System.out.println(newStr);	
	}

	public List<Integer> topKFrequent(int[] nums, int k) {
		return null;
	     
	}
}

    