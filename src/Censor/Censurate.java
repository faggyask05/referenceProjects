package Censor;

public class Censurate {

	/** This method can be changing one word in the sentence.Or if the word what we would like to change has not in the sentence can be throw the word has not found in the sentence message. */ 
	public String censuring(String sentence, String toChange, String toWord) {

		if (sentence.contains(toChange)) {
			sentence = sentence.replaceAll(toChange, toWord);
		} else {
			sentence = "This word has not in the sentense!!!";
		}
		return sentence;

	}

}
