package com.practice.programs;

public class XPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="VickyCool";
printPattern(s);
	}

	private static void printPattern(String s) {
		// TODO Auto-generated method stub
		int i,j,k,x;
		int n=s.length();
		for(i=0;i<n;i++){
			j=n-1-i;
			for(k=0;k<n;k++){
				if(k==i||k==j)
					System.out.print(s.charAt(k));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
