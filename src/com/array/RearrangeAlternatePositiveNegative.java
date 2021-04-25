package com.array;

public class RearrangeAlternatePositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[]= {-1, 2, -3, 4, 5, 6, -7, 8, 9};
		RearrangeAlternatePositiveNegative rearrangeAlternatePositiveNegative= new RearrangeAlternatePositiveNegative();
		ar= rearrangeAlternatePositiveNegative.rearrangeArray(ar,ar.length);
		for(int i=0 ; i < ar.length; i++)
		System.out.print(ar[i]+",");
		
	}

	int[] rearrangeArray(int arr[], int size) {
		
		int i=-1,temp=0;
		for(int j=0;j < arr.length; j++) {
			if(arr[j] < 0) {
				i++;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		System.out.println("position of i"+i);
		int position=i+1,neg=0;
		while(position < size && neg < position && arr[neg] < 0 ) {
		
			temp=arr[neg];
			arr[neg]=arr[position];
			arr[position]= temp;
			position++;	
			neg+=2;
		}
		return arr;
		
	}
}

