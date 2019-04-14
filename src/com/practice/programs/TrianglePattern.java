package com.practice.programs;

public class TrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=7;
		printPattern(i);
	}

	private static void printPattern(int n) {
		// TODO Auto-generated method stub
		int count=0;
		int i,j,k;
		for(i=1;i<=n;i++){
		for(k=0;k<n-1;k++ ){
			System.out.print(" ");
		}
		
		for(j=0;j<i;j++){
			++count;
			System.out.print(count);
			System.out.print(" ");
			
		}
		
		System.out.println();
		n--;
		}
	}

}
