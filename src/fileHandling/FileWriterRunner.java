package fileHandling;

import java.io.IOException;

public class FileWriterRunner {

	public static void main(String[] args)  {
		
		String address ="D:\\filehandling.txt";
		UsingFileWriter oUsingFileWriter = new UsingFileWriter();
		try {
			oUsingFileWriter.fileCreation(address);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
