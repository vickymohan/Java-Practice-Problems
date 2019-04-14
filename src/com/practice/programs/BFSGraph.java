package com.practice.programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {
	static int V;
	static LinkedList<Integer> adjacencyList[];
	;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BFSGraph graph=new BFSGraph(4);
		addEdge(graph,0, 1);
        addEdge(graph,0, 2);
        addEdge(graph,1, 2);
        addEdge(graph,2, 0);
        addEdge(graph,2, 3);
        addEdge(graph,3, 3);
		printBFSGraph(2);
	}
	public BFSGraph(int V){
		this.V=V;
		adjacencyList=new LinkedList[V];
		
		for(int v=0;v<V;v++){
			adjacencyList[v]=new LinkedList<Integer>();
		}
	}
	public static void addEdge(BFSGraph graph,int src,int des){
		graph.adjacencyList[src].add(des);
	}
	public static void printBFSGraph(int s){
		boolean[] visited=new boolean[V];
		Queue<Integer> q=new LinkedList<Integer>();
		visited[s]=true;
		q.add(s);
		while(!q.isEmpty()){
			int n=q.poll();
			System.out.print(n+" ");
			for(int temp:adjacencyList[n]){
				if(!visited[temp]){
					q.add(temp);
					visited[temp]=true;
				}
			}
		}
	}

}
