package com.practice.programs;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "sunday";
        String s2 = "saturday";
	    System.out.println(findEditDistance(s1,s2,s1.length(),s2.length()));
	}

	private static int findEditDistance(String s1, String s2, int length, int length2) {
		// TODO Auto-generated method stub
		int[][] edit=new int[length+1][length2+1];
		for(int i=0;i<=length;i++){
			for(int j=0;j<=length2;j++){
				if(i==0)
					edit[i][j]=j;
				else if(j==0)
					edit[i][j]=i;
				else if(s1.charAt(i-1)==s2.charAt(j-1))
					edit[i][j]=edit[i-1][j-1];
				else
					edit[i][j]=1+min(edit[i-1][j-1],edit[i-1][j],edit[i][j-1]);
			}
		}
		return edit[length][length2];
	}

	private static int min(int i, int j, int k) {
		// TODO Auto-generated method stub
		if(i<=j&&i<=k)
			return i;
		else if(j<=i&&j<=k)
			return j;
		else
		return k;
	}

}
