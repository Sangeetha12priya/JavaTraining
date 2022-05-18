package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CompareFiles {
	
	void compareTwoFiles(String address1,String address2) throws Exception 
	{
		FileReader fileReader1;
		FileReader fileReader2;
		
			fileReader1 = new FileReader(address1);
			fileReader2 = new FileReader(address2);
			BufferedReader bufferReader1 = new BufferedReader(fileReader1);
			BufferedReader bufferReader2 = new BufferedReader(fileReader2);
		
			String line1 = bufferReader1.readLine();
			String line2 = bufferReader2.readLine();
			boolean comparedValue = false;
		
			while(line1 != null && line2 !=null)
			{
				if(line1.equalsIgnoreCase(line2))
				{
					comparedValue = true;
				} else {
					comparedValue = false;
					break;
				}
				line1 = bufferReader1.readLine();
				line2 = bufferReader2.readLine();
			}
			if (comparedValue)
			{
				FileWriter fileWriter = new FileWriter("D:\\Data3.txt");
				BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
			
				String address ="D:\\data1.txt"; 
			/*UsingReader oUsingReader = new UsingReader();
			oUsingReader.readerConcept(address);*/
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
			
				bufferWriter.write("No of Words is :"+wordCount);
				bufferWriter.newLine();
				bufferWriter.write("No of lines is :" +lineCount);
				bufferWriter.newLine();
	        
				bufferWriter.flush();
				bufferWriter.close();
				
			}	
		
			else {
				System.out.println("Files are not equal.");
			}
			bufferReader1.close();
			bufferReader2.close();
			
		}
	

}
