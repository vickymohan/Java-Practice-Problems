package com.practice.programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DFSGraph {
	static int V;
	static LinkedList<Integer> adjacencyList[];
	static boolean[] visited;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFSGraph graph=new DFSGraph(4);
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
        printDFSGraph(2,visited);
	}
	public DFSGraph(int V){
		this.V=V;
		adjacencyList=new LinkedList[V];
		visited=new boolean[V];
		for(int v=0;v<V;v++){
			adjacencyList[v]=new LinkedList<Integer>();
		}
	}
	public static void addEdge(DFSGraph graph,int src,int des){
		graph.adjacencyList[src].add(des);
	}

	public static void printDFSGraph(int s, boolean[] visited) {

		visited[s] = true;
		System.out.print(s + " ");
		for(int temp:adjacencyList[s]) {
			if (!visited[temp]) {
				printDFSGraph(temp, visited);
			}
		}
	}
}
