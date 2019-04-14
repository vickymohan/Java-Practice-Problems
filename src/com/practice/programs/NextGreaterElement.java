package com.practice.programs;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr={2,5,8,12,1,6,10};
findNextGreatest(arr,arr.length);
	}

	private static void findNextGreatest(int[] arr, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++){
			int diff=Integer.MAX_VALUE;
			int closest=-1;
			for(int j=0;j<n;j++){
				if(arr[i]<arr[j]&&arr[j]-arr[i]<diff){
					diff=arr[j]-arr[i];
					closest=j;
				}
			}
			if(closest==-1){
				System.out.print('-');
			}else
				System.out.print(arr[closest]);
		}
	}

}
