package com.array;

public class BitonicSubsequence {

	
	public static void main(String arg[]) {
		
		BitonicSubsequence bitonicSubsequence= new BitonicSubsequence();
		int arr []={1, 11, 2, 10, 4, 5, 2, 1}; 
		bitonicSubsequence.getBitonicSubsequence(arr, arr.length);
	}
	
	void getBitonicSubsequence(int arr[], int arrSize) {
		int i,j;
		int ls[]= new int[arrSize];
		int ds[]= new int[arrSize];
		
		for(i=0; i < arrSize; i++) {
			ls[i]=1;
			ds[i]=1;
		}
		int count=1;
		for(i = 1; i < arrSize; i++) {
			for(j =0; j < i; j++) {
				if(arr[i] > arr[j] && ls[i] < ls[j]+1) {
					
					ls[i]=ls[j]+1;
				}
			}
		}
		count=1;
		for(i = 1; i < arrSize; i++) {
			for(j =0; j < i; j++) {
				if(arr[i] > arr[j] && ds[i] < ds[j]+1) {
					ds[i]=ds[j]+1;
				}
			}
		}
		int max= ls[0]+ds[0]-1;
		for(i=1; i < arrSize ;i++) {
			
			if(ls[i]+ds[i]-1 > max) {
				System.out.println(arr[i]);
				max=ls[i]+ds[i]-1;
		}
		
		}
		System.err.println(max);
	}
}
