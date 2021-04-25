package com.array;

import java.util.Scanner;
class PairSumInSortedArray {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0)
		{
		    int flag =0;
		    int n = s.nextInt();
		    int []a = new int[n];
		    for(int i=0;i<n;i++)
		        a[i] = s.nextInt();
		    int k = s.nextInt();
		    int i=0,j=n-1;
		    while(i<j)
		    {
		        if(a[i]+a[j] == k){
		            System.out.println(a[i]+" "+a[j]+" "+k);
		            i++;j--;
		            flag=1;
		        }
		        else if(a[i]+a[j]<k)
		            i++;
		        else if(a[i]+a[j]>k)
		            j--;
		        
		    }
		    if(flag==0) {
		        
		        System.out.println("We cannot find any element");
		        
		    }
		    t--;
		}
	}
}
