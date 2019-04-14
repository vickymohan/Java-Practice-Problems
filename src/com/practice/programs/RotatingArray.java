package com.practice.programs;

import java.util.Arrays;

public class RotatingArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] num={2,6,7,4,1};*/
		int[] num={1,2,4,6,7};
/*RotatingArray.rotation(num, 2);
RotatingArray.bubbleSort(num);*/
		RotatingArray.binarySort(num, 4,0,num.length-1);
	}

 public static void rotation(int[]num,int N){
	 int i;
	System.out.println("Array before rotating"+Arrays.toString(num));
	 System.out.println();
	 int temp;
	temp=num[0];
	for(i=0;i<N;i++){
		num[i]=num[i+1];
	}
	num[i]=temp;
	 System.out.println("The array after rotating for"+N+"times is"+Arrays.toString(num));
	 
 	}
 
 public static void bubbleSort(int[] num){
	 if(num.length<=0){
		 System.out.println("the array is"+Arrays.toString(num));
	 }
	 for(int i=0;i<num.length;i++){
		 for(int j=i+1;j<num.length-1;j++){
			 int temp;
			 if(num[i]>num[j]){
				 temp=num[i];
				 num[i]=num[j];
				 num[j]=temp;
			 }
		 }
	 }System.out.println("array after sorting is"+Arrays.toString(num));
 }
 public static boolean binarySort(int[] num,int N,int start,int end){
	 int mid = 1+(end-1)/2;
	 if(end>=start){
	 if(num[mid]==N){
		 System.out.println("the element is at"+mid+"index");
		 return true;
	 }
	 else if(num[mid]>N)
		 binarySort(num,N,start,mid-1);
	 else
		 binarySort(num,N,mid+1,end);
	
	 }
	
	 return false;
	 
 }
}
