package com.string;

class Solution {
   public static void main(String args[]) {
	   
	   Solution Solution= new Solution();
	   System.out.println(Solution.repeatedSubstringPattern("abab"));
   }
	
	public boolean repeatedSubstringPattern(String str) {
        int i=0, j = str.length()-1;
         while(i < j){	
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
         return true;
    }
}