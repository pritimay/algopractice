package com.array;

public class ReplaceElementInArray {

	public static void main(String args[]) {
		
		int arr[]= {16, 17, 4, 3, 5, 2};
		ReplaceElementInArray replaceElementInArray= new ReplaceElementInArray();
		replaceElementInArray.getReplacedArray(arr,arr.length);
	}
	
	void getReplacedArray(int arr[], int size) {
	
		int max_right= arr[size-1];
		 arr[size-1]=-1;
		 for(int i=size-2; i >=0; i--) {
			 
			 int temp=arr[i];
			 arr[i]=max_right;
			 if(max_right < temp) {
				 max_right=temp;
			 }
			 
		 }
		 for(int i=0; i< size; i++) {
			 System.out.println(arr[i]);
		 }
		
		
	}
	
	
}
