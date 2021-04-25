package com.array;

public class MinimumSwapRequired {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MinimumSwapRequired minimumSwapRequired= new MinimumSwapRequired();
		int arr[]= {2, 1, 5, 6, 3};
		int toalSwaps= minimumSwapRequired.findMinimumSwap(arr,arr.length);
		System.out.println("total swaps required"+toalSwaps);
	}
	int findMinimumSwap(int arr[], int size) {
		
		int totalSwaps=0;
		int goodMembers=0;
		for(int i=0; i < size; i++) {
			
			if(arr[i] <= 3)
			{
				++goodMembers;
			}
		}
		int badMembers= size-goodMembers;
		int answer= size- goodMembers;
		for(int i=0,j=goodMembers; j < size; ++i, ++j) {
			if(arr[i] > 3) {
				--badMembers;
			}
			if(arr[j] > 3) {
				++badMembers;	
			}
			answer= Math.min(badMembers,goodMembers)	;
		}
			
		
		
		
		
		return answer;
		
		
	}

}
