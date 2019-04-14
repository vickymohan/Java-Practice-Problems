package com.practice.programs;

public class SeperatedByComma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="ABC";
int len=s.length();
char[] ch=new char[2*len];
ch[0]=s.charAt(0);
printCommaSeperated(s,len,ch,1,1);
	}

	private static void printCommaSeperated(String s, int len, char[] ch, int i, int j) {
		// TODO Auto-generated method stub
		if(i==len){
			ch[j]='\0';
			System.out.println(ch);
			return;
		}
		ch[j]=s.charAt(i);
		printCommaSeperated(s, len, ch, i+1, j+1);
		
		ch[j]=',';
		ch[j+1]=s.charAt(i);
		printCommaSeperated(s, len, ch, i+1, j+2);
	}

}
