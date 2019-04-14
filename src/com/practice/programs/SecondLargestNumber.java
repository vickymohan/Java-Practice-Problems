package com.practice.programs;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr={2,5,8,12,1,6,10};
findSeondLargest(arr,arr.length);
	}

	private static void findSeondLargest(int[] arr, int n) {
		// TODO Auto-generated method stub
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			if(arr[i]>first){
				second=first;
				first=arr[i];
			}
			if(arr[i]!=first&&second<arr[i]){
				second=arr[i];
			}
		}
		System.out.println(second);
	}

}
