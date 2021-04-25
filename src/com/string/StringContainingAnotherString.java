package com.string;

public class StringContainingAnotherString {

	
	
	
	
	
	
	public static void main(String args[]) {
		
		StringContainingAnotherString obj= new StringContainingAnotherString();
		
		 String str = "this is a test string"; 
	     String pat = "tist";  
		
	     
	     String outputStr= obj.findPattern(str,pat);
		
		
	}

	private String findPattern(String str, String pat) {


		int len1 = str.length();
		int len2 = pat.length();
		
		if(len1 < len2) {
			System.out.println("no match found");
			return null;
		}
		
		int has_pat[]= new int[256];
		int has_str[] = new int[256];
		
		
		for(int i=0; i < len2; i++) {
			has_pat[pat.charAt(i)]++;
		}
		
		
		for(int i=0; i < len2; i++) {
			System.out.println(has_pat[i]);
		}
		
		
		
		
		return null;
	}
	
	
	
	
	
	
}
