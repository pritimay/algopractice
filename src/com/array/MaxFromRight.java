package com.array;

public class MaxFromRight {

	public static void main(String args[]) {
		
		int arr[] = { 16,17,4,3,5,2};
		for(int i= arr.length - 1; i > 0; i--) {
			int temp = arr[i];
					if(temp > arr[i-1]) {
						arr[i-1]=temp;
					}
			
		}
		for(int i=0; i < arr.length; i++)
		System.out.println(arr[i]);
	}
	
	
}
