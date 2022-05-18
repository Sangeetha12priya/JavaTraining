package fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UsingFileWriter {
	Scanner scan = new Scanner (System.in);
	
	void fileCreation(String address) throws IOException
	{
		Integer numberOfLines = 0;
		String sentences;
		System.out.println("Enter the number of Lines :");
		try {
			numberOfLines = scan.nextInt();
			scan.nextLine();
		}catch(InputMismatchException ime) {
			System.out.println("Enter integer values");
		}
			FileWriter fileWriter = new FileWriter (address);
			BufferedWriter bufferWriter = new BufferedWriter (fileWriter);
			System.out.println("Enter the content in file");
			for(int line = 0; line <= numberOfLines;line++)
			{
				sentences = scan.nextLine();
				bufferWriter.write(sentences);
				bufferWriter.newLine();
			}
		
		bufferWriter.flush();
		bufferWriter.close();
		scan.close();
		
	}
	
}
