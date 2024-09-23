package Censor;

import java.util.Scanner;

public class CensorApp {

	public static void main(String[] args) {

		try (Scanner scn = new Scanner(System.in)) {
			Censurate cens = new Censurate();
			
			System.out.println("Please write the sentence, what you are would like to change.");
			String sentence = scn.nextLine();

			System.out.println("What word would you like to change?");
			String toChange = scn.nextLine();

			System.out.println("which word you want to replace it with?");
			String toWord = scn.nextLine();

			String newSentance = cens.censuring(sentence, toChange, toWord);

			System.out.println("The result: "+ "\n " + newSentance + "\n"+ "The program ran successfully");
			
			scn.close();
		}

	}

}
