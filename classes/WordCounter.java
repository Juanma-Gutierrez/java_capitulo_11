package classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * WordCounter.java
 *
 * @version: 04/02/2023
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class WordCounter {
	private int wordCounter;
	private String word;
	private String file;

	public WordCounter(String file, String word) throws IOException {
		this.word = word;
		this.file = file;
		this.init();
	}

	public void init() throws IOException {
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = br.readLine();
			do {
				checkWordInLine(line);
				line = br.readLine();
			} while (line != null);
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public int checkWordInLine(String line) {
		for (int i = 0; i < line.length() - word.length(); i++) {
			boolean findWord = true;
			for (int j = 0; j < word.length() && findWord; j++) {
				if (line.charAt(i + j) != word.charAt(j)) {
					findWord = false;
				}
			}
			if (findWord)
				this.wordCounter += 1;
		}
		return 0;
	};

	@Override
	public String toString() {
		return "Número de repeticiones de la palabra \"" + this.word + "\": " + wordCounter;
	}

}