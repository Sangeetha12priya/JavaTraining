package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class UsingReader {
	void readerConcept(String address) throws Exception
	{
	
	FileReader fileReader = new FileReader (address);
	BufferedReader bufferReader = new BufferedReader(fileReader);
	String line;
	int lineCount = 0;
	int wordCount = 0;

	while ((line = bufferReader.readLine()) != null) {
		if (line.equals("")) {
			break;
		}
		else {
			
			String words[] = line.split("\\s+");
			wordCount += words.length;
			
			String word[] = line.split("[!?.:]+");
			lineCount += word.length;
			System.out.println(line);
		}
	}
	
	
	System.out.println("Total word count = "+ wordCount);
	System.out.println("No. of Lines :" + lineCount);
	bufferReader.close();
	
	}

}
