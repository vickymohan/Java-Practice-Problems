package com.practice.programs;

public class LIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,22,9,33,21,50,41,60};
		System.out.println(lengthLIS(arr,arr.length-1));
	}

	private static int lengthLIS(int[] arr, int length) {
		// TODO Auto-generated method stub
		int[] LIS=new int[length+1];
		int max=Integer.MIN_VALUE;
		for(int k=0;k<length;k++)
			LIS[k]=1;
		
		for(int i=1;i<length;i++){
			for(int j=0;j<i;j++){
				if(arr[i]>arr[j]&&LIS[j]+1>LIS[i]){
					LIS[i]=LIS[j]+1;
					if(LIS[i]>max){
						max=LIS[i];
					}
				}
			}
		}
		return max;
	}

}
