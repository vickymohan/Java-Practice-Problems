package com.practice.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CreateMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<String> arr=new ArrayList<String>();
	arr.add("90");
	arr.add("56");
	arr.add("8");
	arr.add("9");
	arr.add("42");
	arr.add("19");
	formMaxNumber(arr,arr.size());
	}

	private static void formMaxNumber(List<String> arr, int size) {
		// TODO Auto-generated method stub
		String result="";
		Collections.sort(arr,new Comparator<String>(){

			@Override
			public int compare(String X, String Y) {
				// TODO Auto-generated method stub
				String XY=X+Y;
				String YX=Y+X;
				return XY.compareTo(YX)>0?-1:1;
			}
			
		});
		for(String s:arr)
			result+=s;
		
		System.out.print(result);
	}

}
