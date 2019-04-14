package com.practice.programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="&V(%i!@#c3-k^1#y";
splitchar(s);
System.out.println();
splitStringUsingMatcher(s);
	}

	private static void splitStringUsingMatcher(String s) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile("[A-Za-z]*");
		Matcher m=p.matcher(s);
		while(m.find()){
			System.out.print(m.group());
		}
	}

	private static void splitchar(String s) {
		// TODO Auto-generated method stub
		String delimiter="[^\\w[0-9]]";
		Pattern p=Pattern.compile(delimiter,Pattern.CASE_INSENSITIVE);
		String[] result=p.split(s);
		for(String s1:result){
			if(!s1.equals(""))
				System.out.print(s1);
		}
	}
}


