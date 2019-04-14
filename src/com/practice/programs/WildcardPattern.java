package com.practice.programs;

public class WildcardPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abb";
String pattern="abbc*";
System.out.println(wildCard(str,pattern,str.length(),pattern.length()));
	}

	private static boolean wildCard(String str, String pattern, int n, int m) {
		// TODO Auto-generated method stub
		if(m==0)
			return (n==0);
		boolean[][] T=new boolean[n+1][m+1];
		T[0][0]=true;
		for(int j=1;j<m;j++){
			if(pattern.charAt(j-1)=='*')
				T[0][j]=T[0][j-1];
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				if(pattern.charAt(j-1)=='?'||pattern.charAt(j-1)==str.charAt(i-1))
				{
					T[i][j]=T[i-1][j-1];
				}else if(pattern.charAt(j-1)=='*'){
					T[i][j]=T[i][j-1]||T[i-1][j];
				}else{
					T[i][j]=false;
				}
				}
		}
			return T[n][m];
	}

}
