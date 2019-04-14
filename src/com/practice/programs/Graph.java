package com.practice.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Graph {
	static int V;
	static LinkedList<Integer> adjacencyList[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Graph graph=new Graph(5);
	addEdge(graph, 0, 1);
	addEdge(graph, 0, 4);
	addEdge(graph, 1, 2);
	addEdge(graph, 1, 3);
	addEdge(graph, 1, 4);
	addEdge(graph, 2, 3);
	addEdge(graph, 3, 4);
	printGraph();

	}
	public Graph(int V){
		this.V=V;
		adjacencyList=new LinkedList[V];
		for(int v=0;v<V;v++){
			adjacencyList[v]=new LinkedList<Integer>();
		}
	}
	public static void addEdge(Graph g,int src,int des){
		g.adjacencyList[src].add(des);
		g.adjacencyList[des].add(src);
	}
	public static void printGraph(){
		for(int v=0;v<V;v++){
			System.out.println("Adjacency vertices of vertex"+v);
			System.out.print("head");
			for(int node:adjacencyList[v]){
				System.out.print("-->"+node);
			}
			System.out.println();
		}
	}
	
	

}
