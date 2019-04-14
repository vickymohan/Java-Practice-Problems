package com.practice.programs;

public class PermutationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="ABC";
permute(s,0,s.length());
	}

	private static void permute(String s, int l, int r) {
		// TODO Auto-generated method stub
		if(l==r)
			System.out.println(s);
		for(int i=l;i<r;i++){
			s=swap(s,l,i);
			permute(s,l+1,r);
			s=swap(s,l,i);
		}
	}

	private static String swap(String s, int l, int i) {
		// TODO Auto-generated method stub
		char[] temp=s.toCharArray();
		char ch=temp[i];
		temp[i]=temp[l];
		temp[l]=ch;
		
		return String.valueOf(temp);
	}

}
