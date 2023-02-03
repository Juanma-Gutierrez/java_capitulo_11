package classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class MyFile {
	private ArrayList<String> sortWords;
	private String initFile;
	private String outputFile;

	public MyFile(String initFile, String outputFile) throws IOException {
		this.sortWords = new ArrayList<>();
		this.initFile = initFile;
		this.outputFile = outputFile;
		this.init();
	}

	private void init() throws IOException {
		readFile();
		writeFile();
		Collections.sort(sortWords);
		writeFile();
	}

	private void readFile() {
		try {
			BufferedReader f1 = new BufferedReader(new FileReader(this.initFile));
			String line = "";
			line = f1.readLine();
			while (line != null) {
				this.sortWords.add(line);
				line = f1.readLine();
			}
			f1.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private void writeFile() throws IOException {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(this.outputFile));
			for (int i = 0; i < sortWords.size(); i++)
				bw.write(this.sortWords.get(i) + "\n");
			bw.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<String> getSortWords() {
		return sortWords;
	}

	public String getInitFile() {
		return initFile;
	}

	public String getOutputFile() {
		return outputFile;
	}

}
