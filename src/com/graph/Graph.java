package com.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

	int vertices;
	LinkedList<Integer> adjList[];

	public Graph(int vertices) {
		this.vertices = vertices;
		adjList = new LinkedList[vertices];

		for (int i = 0; i < vertices; ++i)
			adjList[i] = new LinkedList();
	}

	void addEdge(int source, int destination) {
		adjList[source].add(destination);
	}

	private void DFS(Graph g) {
		// TODO Auto-generated method stub
		boolean isVisited[] = new boolean[vertices];

		// the vertex which finishes last should be the last element

		int v = -1;
		for (int vertex = 0; vertex < vertices; vertex++) {
			if (isVisited[vertex] == false) {
				DFSUtil(vertex, isVisited);
				v = vertex;
			}

		}
		
		for( int i=0; i < vertices ;i++) {
			isVisited[i] = false;
		}
		DFSUtil(v, isVisited);
		for(int i=0; i < vertices; i++) {
			if(isVisited[i]==false) {
				
			}
		}

	}

	private void DFSUtil(int vertex, boolean[] isVisited) {
		// TODO Auto-generated method stub

		isVisited[vertex] = true;
		Iterator<Integer> itr = adjList[vertex].iterator();
		while (itr.hasNext()) {
			int n = itr.next();
			if (!isVisited[n]) {
				DFSUtil(n, isVisited);
			}
		}

	}

	public static void main(String args[]) {

		int vertices = 6;
		Graph g = new Graph(vertices);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(4, 1);
		g.addEdge(5, 2);

		g.DFS(g);

	}

}
