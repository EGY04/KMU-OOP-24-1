// ****************************************************************
// CountLetters.java
//
// Reads a word from the standard input and prints the number of 
// occurrences of each letter in that word.
//          
// ****************************************************************
package labPackage;

import java.util.Scanner;

public class CountLetters {
	public static void main(String[] args) {
		int[] counts = new int[26];

		Scanner in = new Scanner(System.in);

		// get word from user
		System.out.print("Enter a single word (letters only, please): ");
		String word = in.next();

		// convert to all upper case
		word = word.toUpperCase();

		// count frequency of each letter in string
			for (int i = 0; i < word.length(); i++) {
				try {	
					counts[word.charAt(i) - 'A']++;
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Not a letter: " + word.charAt(i));
				}
			}
		// print frequencies
		System.out.println();
		for (int i = 0; i < counts.length; i++)
			if (counts[i] != 0)
				System.out.println((char) (i + 'A') + ": " + counts[i]);

		in.close();
	}

}
