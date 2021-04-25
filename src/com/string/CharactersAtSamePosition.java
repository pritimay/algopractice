package com.string;

public class CharactersAtSamePosition {

	public static void main(String rags[]) {
		String str = "AbgdeF";
		CharactersAtSamePosition charactersAtSamePosition = new CharactersAtSamePosition();
		charactersAtSamePosition.printCharacters(str);
	}

	private void printCharacters(String str) {
		int result = 0;
		for (int i = 0; i < str.length() ; i++) {
			if (i == (str.charAt(i) - 'a') || i == (str.charAt(i)- 'A')) {
				System.out.println(str.charAt(i));
				result++;
			}
			
		}
		System.out.println("india"+result);

	}

}
