package com.practice.programs;

public class PalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="forgeeksskeegfor";
findPalinSubstring(str,str.length());
	}

	private static void findPalinSubstring(String str, int n) {
		// TODO Auto-generated method stub
		int maxlength=1;
		int low,start=0;
		int high;
		for(int i=1;i<n;i++){
			low=i-1;
			high=i;
			while(low>=0&&high<n&&str.charAt(low)==str.charAt(high)){
				if(high-low+1>maxlength){
					start=low;
					maxlength=high-low+1;
				}
				low--;
				high++;
			}
			
			low=i-1;
			high=i+1;
			while(low>=0&&high<n&&str.charAt(low)==str.charAt(high)){
				if(high-low+1>maxlength){
					start=low;
					maxlength=high-low+1;
				}
				low--;
				high++;
			}
		}
		System.out.println(str.substring(start,start+maxlength));
		
	}

}
