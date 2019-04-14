package com.practice.programs;

public class CuttingRod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] price={2,5,7,8};
		System.out.println(cutTheRod(price,price.length));

	}

	private static int cutTheRod(int[] price, int length) {
		// TODO Auto-generated method stub
		int[] value=new int[length+1];
		value[0]=0;
		for(int i=1;i<=length;i++){
			int max_val=Integer.MIN_VALUE;
			for(int j=0;j<i;j++){
				max_val=Math.max(max_val, price[j]+value[i-j-1]);
				value[i]=max_val;
			}
		}
		return value[length];
	} 

}
