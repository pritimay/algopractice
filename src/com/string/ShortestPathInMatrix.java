package com.string;

public class ShortestPathInMatrix {

	public static void main(String args[]) {

		String str = "COZY";
		ShortestPathInMatrix shortestPathInMatrix = new ShortestPathInMatrix();
		shortestPathInMatrix.printPath(str);

	}

	private void printPath(String str) {
		int currentX = 0;
		int currentY = 0;
		int length = str.length(), i = 0;
		while (i < length) {
			int nextX = (str.charAt(i) - 'A') / 5;
			int nextY = ((str.charAt(i) - 'B') + 1) % 5;
			while (currentX > nextX) {
				System.out.println("Move up");
				currentX--;
			}
			while (currentY > nextY) {
				System.out.println("Move left");
				currentY--;
			}
			while (currentX < nextX) {
				System.out.println("Move down");
				currentX++;
			}
			while (currentY < nextY) {
				System.out.println("Move Right");
				currentY++;
			}
			i++;
		}

	}
}
