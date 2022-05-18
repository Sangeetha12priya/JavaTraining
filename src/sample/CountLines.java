package sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CountLines {
	
	public static void main(String args[]) throws Exception {
	
	File file = new File("D:\\filehandling.txt");
	
	FileReader fileReader = new FileReader(file);
	BufferedReader bufferReader = new BufferedReader (fileReader);
	String line = bufferReader.readLine();
	
	int lineCount = 0;
	int wordCount = 0;
	while(line != null)
	{
		System.out.println(line);
		line = bufferReader.readLine();
		lineCount++;
	}
	System.out.println("No. Of lines :"+lineCount);
	while(line != null)
	{
		String[] words = line.split(" ");
		wordCount = wordCount + words.length;
	}
	System.out.println("No. of Words :"+wordCount);
	bufferReader.close();
	}
	
}
