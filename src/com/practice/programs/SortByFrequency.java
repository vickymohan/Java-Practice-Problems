package com.practice.programs;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortByFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {0,0,0,1,3,3,2,1,3,5,6,0};
		frequencySort(nums,nums.length);
	}

	private static void frequencySort(int[] nums, int length) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<length;i++){
			if(map.containsKey(nums[i])){
				int count=map.get(nums[i]);
				map.put(nums[i], count+1);
			}else{
				map.put(nums[i],1);
			}
		}
		ValueComparator<Integer,Integer> vc=new ValueComparator<Integer,Integer>(map);
		Map<Integer,Integer> tree=new TreeMap<Integer,Integer>(vc);
		tree.putAll(map);
		
		for(Map.Entry<Integer, Integer> entry:tree.entrySet()){
			for(int i=entry.getValue();i>0;i--)
				System.out.print(entry.getKey()+",");
		}
	}

}
class ValueComparator<T1,T2 extends Comparable<T2>> implements Comparator<T1>{
Map<T1,T2> base;
T2 value1,value2;
public ValueComparator(Map<T1, T2> base){
	this.base=base;
}
	@Override
	public int compare(T1 arg0, T1 arg1) {
		// TODO Auto-generated method stub
		value1=base.get(arg0);
		value2=base.get(arg1);
		 if (value2.compareTo(value1)<=0) {
	            return -1;
	        } else {
	            return 1;
	        } 
	}
	
}
