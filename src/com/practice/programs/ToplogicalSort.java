package com.practice.programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class ToplogicalSort {
	static int V;
	static LinkedList<Integer> adjacencyList[];
	static boolean[] visited;
	static Stack st;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToplogicalSort graph=new ToplogicalSort(4);
		addEdge(graph,0, 1);
        addEdge(graph,0, 2);
        addEdge(graph,1, 2);
        addEdge(graph,2, 0);
        addEdge(graph,2, 3);
        addEdge(graph,3, 3);
        //for disconected graph
        for(int i=0;i<V;i++){
        	if(!visited[i])
		printToplogicalGraph(i,visited);
        }

		while(!st.isEmpty())
			System.out.println(st.pop());
	}
	public ToplogicalSort(int V){
		this.V=V;
		adjacencyList=new LinkedList[V];
		visited=new boolean[V];
		for(int v=0;v<V;v++){
			adjacencyList[v]=new LinkedList<Integer>();
		}
		st=new Stack();
	}
	public static void addEdge(ToplogicalSort graph,int src,int des){
		graph.adjacencyList[src].add(des);
	}

	public static void printToplogicalGraph(int s, boolean[] visited) {

		visited[s] = true;
		Iterator<Integer> itr = adjacencyList[s].listIterator();
		while (itr.hasNext()) {
			int temp = itr.next();
			if (!visited[temp]) {
				printToplogicalGraph(temp, visited);
			}
		}
		st.add(new Integer(s));
	}
}
