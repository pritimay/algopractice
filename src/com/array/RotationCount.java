package com.array;

public class RotationCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int arr[] = {15, 18, 3, 2, 6, 12}; 
        int n = arr.length; */
        RotationCount rotationCount= new RotationCount();
       // rotationCount.getRotaitonCount(arr,n);
        rotationCount.getAllRotation(4234);
			
	}
	void getRotaitonCount(int arr[], int size) {
		
		int min=arr[0],min_index=-1;
		for(int i=0; i < size; i++) {
			if(min > arr[i]) {
				min=arr[i];
				min_index=i;
			}
		}
		System.out.println("minimum index is "+min_index);
		
	}

	void getAllRotation(int number) {

		int numCount = 0;
		int reminder = 0;
		int original= number;
		while (number > 0) {
		
			number = number / 10;
			numCount++;
		}
		System.out.println(numCount);
	
		int powerNumber = (int) Math.pow(10, numCount - 1);
		for (int i = 0; i < numCount - 1; i++) {
			int firstDigit = original / powerNumber;
			int left = original * 10 + firstDigit - (firstDigit * powerNumber * 10);
			original = left;
			System.out.println(left);
		}

	}

}
