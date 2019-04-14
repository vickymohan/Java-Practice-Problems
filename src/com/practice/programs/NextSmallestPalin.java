package com.practice.programs;

import java.util.concurrent.TimeUnit;

public class NextSmallestPalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={9,9,9};
		if(isAll9(num)){
			System.out.print(1);
			for(int i=0;i<num.length-1;i++)
				System.out.print(0);
			System.out.print(1);
		}else{
		findNextPalin(num,num.length);
		printArray(num);
		}
		System.out.println(TimeUnit.DAYS.convert(250000,TimeUnit.MILLISECONDS));

	}

	private static boolean isAll9(int[] num) {
		// TODO Auto-generated method stub
		for(int n:num){
			if(n!=9)
				return false;
		}
		return true;
	}

	private static void printArray(int[] num) {
		// TODO Auto-generated method stub
		for(int n:num)
			System.out.print(n);
	}

	private static void findNextPalin(int[] num, int length) {
		// TODO Auto-generated method stub
		boolean leftSmaller=false;;
		int mid=length/2;
		/*end of left*/
		int i=mid-1;
		/*start of right*/
		int j=(length%2==0)?mid:mid+1;
		
		while(i>=0&&num[i]==num[j]){
			i--;
			j++;
		}
		
		if(i<0||num[i]<num[j]){
		leftSmaller=true;
		}
		while(i>=0){
			num[j++]=num[i--];
		}
		if(leftSmaller){
			int carry = 1;
	       if (length% 2 == 1) {
                num[mid] += 1;
                carry = num[mid] / 10;
                num[mid] %= 10;
            }
            i = mid - 1;
            j = (length % 2 == 0) ? mid : mid + 1;
			while(i>=0){
				num[i]+=carry;
				carry=num[i]/10;
				num[i]%=10;
				num[j++]=num[i--];
			}
		}
		
	}

}
