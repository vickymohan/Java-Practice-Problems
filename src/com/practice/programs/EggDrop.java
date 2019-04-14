package com.practice.programs;

public class EggDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int egg=4;
		int floor=2;
		System.out.println(countPossibilities(egg,floor));
	}

	private static int countPossibilities(int egg, int floor) {
		// TODO Auto-generated method stub
		int[][] eggDrop=new int[egg+1][floor+1];
		int min=Integer.MAX_VALUE;
		for(int i=0;i<=egg;i++){
			eggDrop[i][0]=0;
			eggDrop[i][1]=1;
		}
		for(int j=0;j<=floor;j++)
			eggDrop[1][j]=j;
		for(int i=2;i<=egg;i++){
			for(int j=2;j<=floor;j++){
				for(int m=1;m<=j;m++){
					eggDrop[i][j]=1+Math.max(eggDrop[i][j-m], eggDrop[i-1][m-1]);
					if(eggDrop[i][j]<min)
						min=eggDrop[i][j];
					
				}
			}
		}
		return min;
	}

}
