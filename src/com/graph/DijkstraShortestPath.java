package com.graph;

public class DijkstraShortestPath {

	static final int Vertices = 9;

	private void getShortestPath(int[][] graph, int source) {
		// TODO Auto-generated method stub
		int dist[] = new int[Vertices];
		boolean sptSet[] = new boolean[Vertices];
		for (int i = 0; i < Vertices; i++) {
			dist[i] = Integer.MAX_VALUE;
			sptSet[i] = false;
		}
		dist[source] = 0;
		for (int i = 0; i < Vertices - 1; i++) {
			int u = minimumDistance(dist, sptSet);
			sptSet[u] = true;
			for(int v=0; v < Vertices; v++) {
				if(!sptSet[v] && graph[u][v] != 0 && dist[v] > dist[u]+graph[u][v] && dist[u] != Integer.MAX_VALUE) {
					dist[v] = dist[u]+graph[u][v];
				}
			}
		}

	}

	private int minimumDistance(int[] dist, boolean[] sptSet) {
		// TODO Auto-generated method stub
		int index = -1;
		int min = Integer.MAX_VALUE;
		for (int v = 0; v < Vertices; v++) {
			if (sptSet[v] == false && dist[v] < min) {
				min = dist[v];
				index = v;
			}
		}
		return index;
	}

	public static void main(String agrs[]) {

		int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
				{ 0, 8, 0, 7, 0, 4, 0, 0, 2 }, { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
				{ 0, 0, 4, 14, 10, 0, 2, 0, 0 }, { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
				{ 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
		DijkstraShortestPath shortestPath = new DijkstraShortestPath();
		int source = 0;
		shortestPath.getShortestPath(graph, source);

	}

}
