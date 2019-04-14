package com.practice.programs;

import java.util.LinkedList;

public class Prims {
	static final int V=5;
	static int[] key;
	static int[] parent;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int graph[][] = new int[][] {{0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0},
           };
primsAlgo(graph);
printGraph(graph);
	}
	private static void printGraph(int[][] graph) {
		// TODO Auto-generated method stub
		for(int i=1;i<V;i++){
			System.out.print(parent[i]+"-"+i+" ");
			System.out.println("Weight"+graph[i][parent[i]]);
		}
	}
	
	public static void primsAlgo(int[][] graph){
		key=new int[V];
		parent=new int[V];
		boolean[] mtSet=new boolean[V];
		for(int v=0;v<V;v++){
			key[v]=Integer.MAX_VALUE;
		}
		key[0]=0;
		parent[0]=-1;
		for(int count=0;count<V-1;count++){
			int u=findMinIndex(mtSet,key);
			mtSet[u]=true;
			for(int v=0;v<V;v++){
				if(!mtSet[v]&&graph[u][v]!=0&&graph[u][v]<key[v]){
					parent[v]=u;
					key[v]=graph[u][v];
				}
			}
		}
		
	}
	private static int findMinIndex(boolean[] mtSet, int[] key) {
		// TODO Auto-generated method stub
		int min=Integer.MAX_VALUE,min_index=0;
		for(int v=0;v<V;v++){
			if(!mtSet[v]&&key[v]<min){
				min=key[v];
				min_index=v;
			}
		}
		return min_index;
	}
	
	

}
