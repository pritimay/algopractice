package com.array;

import java.util.Arrays;

public class ArrayAlternate {

	static int arr[] = new int[]{0,0,1,1}; 
    
    // Method for zig-zag conversion of array 
    static void zigZag() 
    { 
        // Flag true indicates relation "<" is expected, 
        // else ">" is expected.  The first expected relation 
        // is "<" 
        boolean flag = true; 
          
        int temp =0; 
       Arrays.sort(arr);
        for (int i=0; i<=arr.length-2; i++) 
        { 
            if (flag)  /* "<" relation expected */
            { 
                /* If we have a situation like A > B > C, 
                   we get A > B < C by swapping B and C */
                if (arr[i] > arr[i+1]) 
                { 
                    // swap 
                    temp  = arr[i]; 
                    arr[i] = arr[i+1]; 
                    arr[i+1] = temp; 
                } 
                  
            } 
            else /* ">" relation expected */
            { 
                /* If we have a situation like A < B < C, 
                   we get A < C > B by swapping B and C */
                if (arr[i] < arr[i+1]) 
                { 
                    // swap 
                    temp = arr[i]; 
                    arr[i] = arr[i+1]; 
                    arr[i+1] = temp; 
                } 
            } 
            flag = !flag; /* flip flag */
        } 
    } 
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zigZag(); 
		System.out.println(Arrays.toString(arr)); 
	}

}
