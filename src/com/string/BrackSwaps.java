package com.string;

public class BrackSwaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "[]][]["; 
        System.out.println("total count"+swapCount(s) );
        System.out.println(Math.pow(64, 6));
	}

	/**
	 * @param s
	 * @return
	 */
	/**
	 * @param s
	 * @return
	 */
	private static int swapCount(String s) {
		
		int swapCount=0;
		int openBracket=0; int closeBracket= 0;
		int imbalance=0; 	
		char []inputArray= s.toCharArray();
		for(int i=0; i< inputArray.length; i++) {
			if(inputArray[i] == '[') {
				openBracket++;
				if(imbalance > 0) {
					swapCount+=imbalance;
					imbalance--;
				}
			}
			else if(inputArray[i] == ']') {
				closeBracket++;
				imbalance= closeBracket-openBracket;
			}
		}
	return swapCount;
	}

}
