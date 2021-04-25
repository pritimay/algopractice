package com.array;
import java.util.Scanner;


/*
 An array is called Bitonic if it is comprises of an increasing sequence of integers followed immediately by a decreasing sequence of integers.
 Given a bitonic array A of N distinct integers. Find a element X in it.

*/
class BitonicArray
 {
	public static void main (String[] args)
	 {
	 //code
	 /*Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0){
	     int n = sc.nextInt();
	     int arr[] = new int[n];
	     for(int i=0;i<n;i++){
	         arr[i]=sc.nextInt();
	 	     }
	 	     int test = sc.nextInt();

	 	     for(int i=0;i<n;i++){
	 	          if(arr[i]==test){
	 	          System.out.println(i);
	 	          break;
	 	          }
	 	          else if(arr[i]!=0 && i==n-1)
	 	          System.out.println("-1");
	 	          else
	 	          continue;
	 	      }
	 	}*/
		
		int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3}; 
        int n = arr.length; 
        int key = 6; 
		BitonicArray bitonicArray= new BitonicArray();
		int i= bitonicArray.findElement(arr,0,n-1,key);
		
	 }
	int findElement(int arr[], int low, int high, int key) {
		
		if(high < low)
			return -1;
		int mid= low+high/2;
		if(arr[mid]==key)
			return key;
		if(arr[low] <= arr[mid]) {
			if(key >= arr[low] && key<=arr[mid]) {
				return findElement(arr, low, mid-1, key);
				
			}
			return findElement(arr, mid+1, high, key);
		}
		if (key >= arr[mid] && key <= arr[high]) 
            return findElement(arr, mid+1, high, key); 
        
        return findElement(arr, low, mid-1, key); 
		
		
		
	}
}