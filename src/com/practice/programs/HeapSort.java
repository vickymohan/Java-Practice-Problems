package com.practice.programs;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,1,5,7,3,6,4};
		heapSort(arr,0,arr.length-1);
		printArray(arr);
	}
	private static void heapSort(int[] arr, int l, int n) {
		// TODO Auto-generated method stub
		for(int i=n/2;i>=0;i--)
			heapify(arr,n,i);
		for(int i=n;i>=0;i--){
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
		
		
		
	}
	private static void heapify(int[] arr, int n, int i) {
		// TODO Auto-generated method stub
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n && arr[l]>arr[largest])
			largest=l;
		if(r<n&&arr[r]>arr[largest])
			largest=r;
		
		if(largest!=i){
			int temp=arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
			heapify(arr,n,largest);
		}
		
	}
	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]);
	}
}
