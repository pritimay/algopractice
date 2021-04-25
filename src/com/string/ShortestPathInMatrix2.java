package com.string;

public class ShortestPathInMatrix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "India";
		ShortestPathInMatrix2 shortestPathInMatrix2 = new ShortestPathInMatrix2();
		shortestPathInMatrix2.findString(str);

	}

	private void findString(String str) {

		int currentX = 0;
		int currentY = 0;
		int length = str.length(), i = 0;
		while (i < length) {
			int nextX = (str.charAt(i) - 'A') / 5;
			int nextY = (str.charAt(i) - 'B' + 1) % 5;
			while (currentX < nextX) {

			}
		}

	}

}
