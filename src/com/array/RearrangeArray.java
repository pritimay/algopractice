package com.array;

import java.util.Arrays;

public class RearrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RearrangeArray reArrangeArray= new RearrangeArray();
		int inputArray[]= {1,2,3,4,5,6,7};
		int size = inputArray.length; 
		reArrangeArray.rearrangeArray(inputArray,size); 
	    
		
		
	}
	void rearrangeArray(int arr[],int size) {
		
		int evens= size/2;
		int odds= size-evens;
		int tempArray[]= new int[size];
		for(int i=0; i < size; i++) {
			tempArray[i]=arr[i];
		}
		Arrays.sort(tempArray);
		int j=odds-1;
		for(int i=0; i < size ; i+=2) {
			arr[i]=tempArray[j];
			j--;
		}
		j=odds;
		for(int i=1; i < size; i+=2) {
			arr[i]= tempArray[j];
			j++;
		}
		System.out.println("New Array is");
		for(int i=0; i < size; i++) {
			System.out.print(arr[i]+"");
		}
		
	}

}
