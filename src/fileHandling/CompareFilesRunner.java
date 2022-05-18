package fileHandling;

public class CompareFilesRunner {

	public static void main(String[] args)  {
		
		String address1 ="D:\\Data1.txt";
		String address2 ="D:\\Data2.txt";
		
		CompareFiles oCompareFiles = new CompareFiles();
		try {
			oCompareFiles.compareTwoFiles(address1,address2);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
