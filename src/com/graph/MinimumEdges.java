package com.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class MinimumEdges {

	public static void main(String args[]) {

		int n = 9;
		Vector<Integer> edges[] = new Vector[9];
		for (int i = 0; i < n; i++) {
			edges[i] = new Vector<>();
		}

		addEdge(edges, 0, 1);
		addEdge(edges, 0, 7); 
        addEdge(edges, 1, 7); 
        addEdge(edges, 1, 2); 
        addEdge(edges, 2, 3); 
        addEdge(edges, 2, 5); 
        addEdge(edges, 2, 8); 
        addEdge(edges, 3, 4); 
        addEdge(edges, 3, 5); 
        addEdge(edges, 4, 5); 
        addEdge(edges, 5, 6); 
        addEdge(edges, 6, 7); 
        addEdge(edges, 7, 8); 
        int u = 0; 
        int v = 5; 
        findMinimumEdge(edges,u,v,n);

	}

	private static void findMinimumEdge(Vector<Integer>[] edges, int u, int v, int vertices) {
		// TODO Auto-generated method stub
		
		Vector<Boolean> visited = new Vector<>(vertices);
		for(int temp=0; temp < vertices; temp++) {
			visited.addElement(false);
		}
		Vector<Integer> distance = new Vector<>(vertices);
		for(int temp=0; temp < vertices; temp++) {
			distance.addElement(0);
		}
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(u);
		distance.setElementAt(0, u);
		visited.setElementAt(true,0);
		while(!queue.isEmpty())
		{
			int x = queue.peek();
			queue.poll();
			for(int i=0; i < edges[x].size(); i++) {
				if(visited.elementAt(edges[x].get(i))) {
					continue;
				}
				distance.setElementAt(distance.get(x)+1, edges[x].get(i));
				queue.add(edges[x].get(i));
				visited.setElementAt(true, edges[x].get(i));
				
			}
		
		
		}
		
		System.out.println(distance.get(v));
		
	}

	private static void addEdge(Vector<Integer>[] edges, int i, int j) {
		// TODO Auto-generated method stub
		edges[i].add(j);
		edges[j].add(i);

	}

}
