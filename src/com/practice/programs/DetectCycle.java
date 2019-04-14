package com.practice.programs;

import java.util.Iterator;
import java.util.LinkedList;

public class DetectCycle {

	static int V;
	static LinkedList<Integer> adjacencyList[];
	static boolean[] visited;
	static boolean[] isStack;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetectCycle graph=new DetectCycle(4);
		addEdge(graph,0, 1);
        addEdge(graph,0, 2);
        addEdge(graph,1, 2);
        addEdge(graph,2, 0);
        addEdge(graph,2, 3);
        addEdge(graph,3, 3);
        //for disconected graph
        /*for(int i=0;i<V;i++){
        	if(!visited[i])
		printDFSGraph(i,visited);
        }*/
        //for connected graph
       System.out.println(isCyclic(2,visited,isStack));
	}
	public DetectCycle(int V){
		this.V=V;
		adjacencyList=new LinkedList[V];
		visited=new boolean[V];
		isStack=new boolean[V];
		for(int v=0;v<V;v++){
			adjacencyList[v]=new LinkedList<Integer>();
		}
	}
	public static void addEdge(DetectCycle graph,int src,int des){
		graph.adjacencyList[src].add(des);
	}

	public static boolean isCyclic(int s, boolean[] visited,boolean[] isStack) {
		if(isStack[s])
			return true;
		if(visited[s])
			return false;
		visited[s] = true;
		isStack[s]=true;
		for(int temp:adjacencyList[s]){
			if(isCyclic(temp, visited, isStack))
				return true;
		}
		isStack[s]=false;
		return false;
	}
}
