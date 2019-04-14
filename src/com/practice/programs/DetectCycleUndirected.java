package com.practice.programs;

import java.util.Iterator;
import java.util.LinkedList;

public class DetectCycleUndirected {

	static int V;
	static LinkedList<Integer> adjacencyList[];
	static boolean[] visited;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetectCycleUndirected graph=new DetectCycleUndirected(4);
		addEdge(graph,0, 1);
        addEdge(graph,0, 2);
        addEdge(graph,1, 2);
        addEdge(graph,2, 0);
        addEdge(graph,2, 3);
        addEdge(graph,3, 3);
        //for disconected graph
        for(int i=0;i<V;i++){
        	if(!visited[i])
		System.out.print(printDFSGraph(i,visited,-1));
        }
        //for connected graph
        /*System.out.println(printDFSGraph(2,visited,-1));*/
	}
	public DetectCycleUndirected(int V){
		this.V=V;
		adjacencyList=new LinkedList[V];
		visited=new boolean[V];
		for(int v=0;v<V;v++){
			adjacencyList[v]=new LinkedList<Integer>();
		}
	}
	public static void addEdge(DetectCycleUndirected graph,int src,int des){
		graph.adjacencyList[src].add(des);
	}

	public static boolean printDFSGraph(int s, boolean[] visited,int parent) {

		visited[s] = true;
		for(int temp:adjacencyList[s]){
			if (!visited[temp]) {
				if(printDFSGraph(temp, visited,s))
					return true;
			}
			else if(s!=parent)
				return true;
		}
		return false;
	}
}
