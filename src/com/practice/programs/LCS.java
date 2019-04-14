package com.practice.programs;

public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "AGGTAB";
	    String s2 = "GXTXAYB";
	    char[] ch1=s1.toCharArray();
	    char[] ch2=s2.toCharArray();
	    int m=ch1.length;
	    int n=ch2.length;
	    System.out.println(findLCS(ch1,ch2,m,n));
	}

	private static int findLCS(char[] ch1, char[] ch2, int m, int n) {
		// TODO Auto-generated method stub
		int[][] LCS=new int[m+1][n+1];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				if(i==0||j==0)
					LCS[i][j]=1;
				else if(ch1[i-1]==ch2[j-1])
					LCS[i][j]=LCS[i-1][j-1]+1;
				else
					LCS[i][j]=Math.max(LCS[i-1][j], LCS[i][j-1]);
				
				if(LCS[i][j]>max)
					max=LCS[i][j];
			}
		}
		return max;
	}

}
