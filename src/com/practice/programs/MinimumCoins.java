package com.practice.programs;

public class MinimumCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins={9,5,6,2};
		int v=11;
		System.out.println(findMinCoins(coins,v,coins.length));
	}

	private static int findMinCoins(int[] coins, int v, int length) {
		// TODO Auto-generated method stub
		int res=Integer.MAX_VALUE;
		int sub_res=Integer.MAX_VALUE;
		if(v==0)
			return v;
		for(int i=0;i<length;i++){
			if(v>=coins[i]){
				sub_res=findMinCoins(coins, v-coins[i], length);
				if(sub_res!=Integer.MAX_VALUE&&res>sub_res+1)
					res=sub_res+1;
			}
		}
		return res;
	}

}
