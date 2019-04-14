package com.practice.programs;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr={2,1,5,7,3,6,4};
quickSort(arr,0,arr.length-1);
printArray(arr);
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]);
	}

	private static void quickSort(int[] arr, int l, int r) {
		if(l<r){
		// TODO Auto-generated method stub
		int mid=partition(arr,l,r);
		quickSort(arr,l,mid-1);
		quickSort(arr,mid+1,r);
		}
		
	}

	private static int partition(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		
		int pivot=arr[r];
		int i=l-1;
		for(int k=l;k<=r;k++){
			if(arr[k]<pivot){
				i++;
				int temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
			}
		}
		int temp2=arr[i+1];
		arr[i+1]=arr[r];
		arr[r]=temp2;
		return i+1;
		
	}

}
