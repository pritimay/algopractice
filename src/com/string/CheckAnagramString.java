package com.string;
import java.util.Arrays;


public class CheckAnagramString {

	
	public static void main(String args[]) {
		
		String str1 = "pritimaya";
		String str2 = "pritimayq";
		
		CheckAnagramString checkAnagramString= new CheckAnagramString();
		
		System.out.println(checkAnagramString.varifyAnagram(str1,str2));
		
		
	}

	private boolean varifyAnagram(String str1, String str2) {
		
		int len1 = str1.length();
		int len2 = str2.length();
		
		int count1[] = new int[256];
		int count2[] = new int[256];
		Arrays.fill(count1,0);
		Arrays.fill(count2,0);
		int i;
		if(len1 !=len2) {
			System.out.println("nothing"+0);
			return false;
		}
		for(i=0; i < len1 && i < len2; i++) {
			count1[str1.charAt(i)]++;
			count2[str2.charAt(i)]++;
		}
		boolean isANagran=false;
		for(int j=0; j < 256; j++) {
			if(count1[j]!=count2[j]) {
				System.out.println("nothing2"+0);
				isANagran= false;
				break;
			}
		}
		return true;
		
	}
}
