package com.practice.programs;

public class BinCoeff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int k=2;
		System.out.println(findCombination(n,k));
	}

	private static int findCombination(int n, int k) {
		// TODO Auto-generated method stub
		int[] bin=new int[k+1];
		bin[0]=1;
		for(int i=1;i<=n;i++){
			for(int j=Math.min(i, k);j>0;j--)
				bin[j]=bin[j]+bin[j-1];
		}
		return bin[k];
	}

}
