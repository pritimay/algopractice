package com.array;

public class MaximumProductSubArray {

	public static void main(String args[]) {
		int arr[] = {1, -2, -3, 0, 7, -8, -2};
		int length = arr.length;
		MaximumProductSubArray maximumProductSubArray = new MaximumProductSubArray();
		int maximumProduct = maximumProductSubArray.findMaximum(arr,length);
		System.out.println(maximumProduct);
	}
	
	int findMaximum(int arr[], int length) {

		int flag = 0;
		int max_so_far = 0;
		int max_ending_here = 0;
		int min_ending_here = 0;
		if (arr.length == 0) {
			return 0;
		} else if (arr.length == 0) {
			return (arr[0]);
		}

		else {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > 0) {
					max_ending_here = max_ending_here * arr[i];
					min_ending_here = Math.min(min_ending_here * arr[i], 1);
					flag = 1;
				} else if (arr[i] == 0) {
					max_ending_here = 1;
					min_ending_here = 1;
				} else {
					int temp = max_ending_here;
					max_ending_here = Math.max(min_ending_here * arr[i], 1);
					min_ending_here = temp * arr[i];
				}
				if (max_so_far < max_ending_here) {
					max_so_far = max_ending_here;
				}

			}
			if(flag ==0 && max_so_far == 1 )
				return 0;
			return max_so_far;
		}

	}
	
	
}
