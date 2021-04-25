package com.graph;

import java.util.Iterator;
import java.util.LinkedList;

class Graph2 {

	int vertices;

	LinkedList<Integer> asjLis[];

	public Graph2(int k) {
		this.vertices = k;
		asjLis = new LinkedList[k];
		for (int i = 0; i < this.vertices; i++) {
			asjLis[i] = new LinkedList<>();
		}
	}

	void addEdge(int source, int destination) {
		asjLis[source].add(destination);
	}
	private void bfs(int i, Graph2 g) {
	
		// TODO Auto-generated method stub
		
		boolean vsiited[] = new boolean[vertices];
		LinkedList<Integer> visitedList= new LinkedList<>();
		vsiited[i] = true;
		visitedList.add(i);
		while( visitedList.size() != 0) {
			i = visitedList.poll();
			Iterator<Integer> itr= asjLis[i].iterator();
			while(itr.hasNext()) {
				int number = itr.next();
				if(!vsiited[number]) {
					vsiited[number] = true;
					visitedList.add(number);
				}
			}
		}
		
		
		
	}

	public static void main(String arg[]) {
		int vertices = 5;
		Graph2 g = new Graph2(5);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		g.bfs(2,g);
	}

	

}