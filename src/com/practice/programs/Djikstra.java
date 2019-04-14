package com.practice.programs;

public class Djikstra {

	static final int V=9;
	static int[] key;
	static int[] parent;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
           };
           DjikstraAlgo(graph,0);
           printShortestGraph(key);
	}
	private static void printShortestGraph(int[] key) {
		// TODO Auto-generated method stub
		System.out.println("vertex   Distance from source");
		for(int i=1;i<V;i++){
			System.out.println(i+"\t \t"+key[i]);
		}
	}
	
	public static void DjikstraAlgo(int[][] graph,int src){
		key=new int[V];
		parent=new int[V];
		boolean[] mtSet=new boolean[V];
		for(int v=0;v<V;v++){
			key[v]=Integer.MAX_VALUE;
		}
		key[src]=0;
		parent[src]=-1;
		for(int count=0;count<V-1;count++){
			int u=findMinimumIndex(mtSet,key);
			mtSet[u]=true;
			for(int v=0;v<V;v++){
				if(!mtSet[v]&&graph[u][v]!=0&&graph[u][v]+key[u]<key[v]){
					parent[v]=u;
					key[v]=key[u]+graph[u][v];
				}
			}
		}
		
	}
	private static int findMinimumIndex(boolean[] mtSet, int[] key2) {
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
