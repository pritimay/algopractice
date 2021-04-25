package com.array;

public class SegregateEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {0, 1, 0, 1, 0, 0, 1, 1, 1, 0}; 
		SegregateEvenOdd segregateEvenOdd= new SegregateEvenOdd();
		segregateEvenOdd.segrateEvenOdd(arr,arr.length);

	}

	void segrateEvenOdd(int arr[], int size) {
		
		
		int i=0; int j=-1;
		while(i < size) {
			if(arr[i]==0) {
			j++;
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
			i++;
			
		}
		for(int k=0; k < size; k++)
		System.out.println(arr[k]);
		
		
	}
}
