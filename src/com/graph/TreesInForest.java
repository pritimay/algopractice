package com.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class TreesInForest {
	
	int vertices;
	LinkedList<Integer> adjList[];
	
	public TreesInForest(int vertex) {
		this.vertices = vertex;
		adjList = new LinkedList[this.vertices];
		for(int i=0 ;i < vertex; i++) {
			adjList[i]= new LinkedList<>();
		}
	}
	
	private void addEdge(int source, int destination) {
		adjList[source].add(destination);
	}
	
	private void DFSUtil(TreesInForest graph, int vertices, int vertex) {
		
		boolean visited[] = new boolean[vertices];
		
		visited[vertex] = true;
	
		Iterator<Integer> itr= adjList[vertex].listIterator();
		while(itr.hasNext()) {
			
			int vertix = itr.next();
			if(!visited[vertix]) {
				
			}
			
		}
		
		
	}
	
	
	private void getTrees(TreesInForest treeInForest) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
	}
	

	public static void main(String[] args) {

		int vertex= 5;
		TreesInForest treeInForest = new TreesInForest(vertex);
		treeInForest.addEdge(0, 1);
		treeInForest.addEdge(0, 2);
		treeInForest.addEdge(3, 4);		
		treeInForest.getTrees(treeInForest);	
	}

	

}
