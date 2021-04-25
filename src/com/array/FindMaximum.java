package com.array;

public class FindMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,2 ,7,5 ,6,3};
		FindMaximum findMaximum= new FindMaximum();
		//System.out.println(findMaximum.getElement(arr,0,arr.length-1));
		findMaximum.findMinimumDistance(arr,0,arr.length);
	}
	int getElement(int arr[], int low, int high) {
		int num=arr[low];
		for(int i=low+1; i <= high; i++) {
			if(num < arr[i]) {
				num=arr[i];
			}
			else {
				break;
			}
		}
		return num;
	}
	void findMinimumDistance(int arr[], int low, int high) {
		
		int x=3,y=6;
		int min= Integer.MAX_VALUE;
		for(int i=0; i < arr.length; i++) {
			for(int j=0+i; j < arr.length; j++) {
				if((x==arr[i] && y==arr[j]) || (x==arr[j] && y==arr[i]) && min > Math.abs(i-j)) {
					min=Math.abs(i-j);
				}
			}
		}
		System.out.println(min);
		
		
	}

}
