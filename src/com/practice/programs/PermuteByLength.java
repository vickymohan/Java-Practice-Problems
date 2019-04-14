package com.practice.programs;

public class PermuteByLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char[] ch={'a','b','c','d'};
int l=3;
permute(ch,l,"",ch.length);
	}

	private static void permute(char[] ch, int k, String prefix, int length) {
		// TODO Auto-generated method stub
		if(k==0){
			System.out.println(prefix);
		return;	
		}
		
		for(int i=0;i<length;i++){
			String newprefix=prefix+ch[i];
			permute(ch,k-1,newprefix,length);
		}
	}

}
