package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTextFile {

	/**
	 * 
	 * Question: Read and print the text content line by line.
	 * 
	 */

	public static void getTextFileContent(File file) throws IOException, FileNotFoundException {

		FileReader fr = new FileReader(file);

		BufferedReader br = new BufferedReader(fr);

		String content = null;

		while ((content = br.readLine()) != null) {

			System.out.println(content);

		}

		br.close();
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {

		String file = System.getProperty("user.dir") + "\\src\\dataFile\\TextFile.txt";

		getTextFileContent(new File(file));

	}

}
