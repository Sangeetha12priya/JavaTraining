package fileHandling;

public class ReaderRunner {

	public static void main(String[] args)   {
		
		String address = "D:\\data1.txt";
		
		UsingReader oUsingReader = new UsingReader();
		try {
			oUsingReader.readerConcept(address);
		} catch (Exception e) {
			e.printStackTrace();
		}	
		}

}
