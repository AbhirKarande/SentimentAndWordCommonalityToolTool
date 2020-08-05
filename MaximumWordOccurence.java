package main.java.com.nlp.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MaximumWordOccurence {
	static void getWords(String fileName, Map<String, Integer> words) throws FileNotFoundException  {
		Scanner file = new Scanner(new File(fileName));
		while(file.hasNext()) {
			String word = file.next();
			Integer count = words.get(word);
			if(count != null) {
				count++;
			}
			else
				count = 1;
			words.put(word, count);
		}
		file.close();
	}
	static int getMaxOccurence(Map<String, Integer> words) {
		int max = 1;
		for(Entry<String, Integer> word: words.entrySet()) {
			if(word.getValue() > max) {
				max = word.getValue();
				
		
			}
			
		}
		return max;
	}
	public static void main(String[] args) throws FileNotFoundException {
		Map<String, Integer> words = new HashMap<String,Integer>();
		getWords("D:\\MyStuff\\TextMining\\corpus\\JH2.txt", words);
		int max = getMaxOccurence(words);
		for(Entry<String, Integer> word: words.entrySet()) {
			if(word.getValue() <= max) {
				System.out.println(word);
			}
		}
	}
}
