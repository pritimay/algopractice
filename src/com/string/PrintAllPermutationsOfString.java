package com.string;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutationsOfString {

	
	public static void main(String args[]) {
	String str= "aa";
	PrintAllPermutationsOfString printAllPermutationsOfString = new PrintAllPermutationsOfString();
	int low= 0, high= str.length()-1;
	List<String> permutationsList= new ArrayList();
	printAllPermutationsOfString.printAllPermutations(str,low,high, permutationsList);
	}
	private void printAllPermutations(String str, int low, int high, List<String> permutaionsList) {
		if(low == high) {
			System.out.println(str);
			permutaionsList.add(str);
		}
		else {
			for(int i= low; i <= high; i++) {
				str= swap(str,low, i);
				printAllPermutations(str,low+1,high,permutaionsList);
				str= swap(str,low,i);
			}
		}
	}
	private String swap(String str, int low, int i) {
		
		char []strArray=str.toCharArray();
		char temp= strArray[low];
		strArray[low] = strArray[i];
		strArray[i] = temp;
		return String.valueOf(strArray);
		
	}

}
