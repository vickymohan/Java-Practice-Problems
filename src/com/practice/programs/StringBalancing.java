package com.practice.programs;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringBalancing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s="(a){2}(b){3}(c){2}";*/
		/*String s="a{2}b{3}c{2}";*/
		/*String s="a(b(c){2}){2}d{3}";*/
		/*String s="a((bc){2}){2}d{3}";*/
		/*String s="(ab(c){2}){2}d{3}";*/
		/*String s="(ab{2}(c){2}){2}d{3}";*/
		String s="((x){2}(yz){3})d{2}";
		
	balanceString(s);

	}

	private static void balanceString(String s) {
		// TODO Auto-generated method stub
		String temp="";
		String temp3="";
		Matcher m=Pattern.compile("[A-Za-z0-9()]").matcher(s);
		while(m.find()){
			temp+=m.group();
		}
		
		for(int i=0;i<temp.length()-1;i++){
			if(temp.charAt(i)=='('||temp.charAt(i)==')'){
			temp=findClosingParantheses(temp);
			temp3=String.valueOf(temp);
			}else if(Character.isDigit(temp.charAt(i+1))){
			StringBuilder tempBuilder=new StringBuilder(temp);
			int tempIndex=tempBuilder.lastIndexOf(" ");
			if(tempIndex==-1||tempIndex>=i)
				tempIndex=i;
			int k=Integer.parseInt(String.valueOf(temp.charAt(i+1)));
			tempBuilder.setCharAt(i+1, ' ');
			String temp2=tempBuilder.substring(i+1,tempBuilder.length());
			temp3=tempBuilder.substring(0, i+1);
			String z="";
			while(k>1){
				z+=temp3.substring(tempIndex,i+1);
				k--;
			}
			temp3+=z;
			temp3+=temp2;
			}
		}
		if(Pattern.compile("[0-9]").matcher(temp3).find())
			balanceString(temp3);
		else{
		temp3=temp3.replace(" ", "");
		System.out.println(temp3);
		}
	}

	private static String findClosingParantheses(String d) {
		StringBuilder temp=new StringBuilder(d);
		String temp3="";
		// TODO Auto-generated method stub
		Stack<Character> s=new Stack<Character>();
		int index=temp.lastIndexOf("(");
		s.add(temp.charAt(index));
		for(int j=index+1;j<temp.length()-1;j++){
			if(temp.charAt(j)=='(')
				s.push(temp.charAt(j));
			else if(temp.charAt(j)==')')
				s.pop();
			if(s.isEmpty()){
				temp.setCharAt(index, ' ');
				temp.setCharAt(j, ' ');
				
				if(Character.isDigit(temp.charAt(j+1))){
					int x=Integer.parseInt(String.valueOf(temp.charAt(j+1)));
					temp.setCharAt(j+1, ' ');
					
					String temp2=temp.substring(j+1,temp.length());
					temp3=temp.substring(0, j+1);
					String z="";
					while(x>1){
						z+=temp3.substring(index+1,j);
						x--;
					}
					temp3+=z;
					temp3+=temp2;
					return temp3;
				}
				temp3=String.valueOf(temp);
				return temp3;
			}
			
		}
		return temp3;
	}

}
