package trial;
import java.util.Scanner;

public class StringExample4 {
	public static void main(String args[])
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the first String :");
		String str1 = scan.nextLine();
		System.out.println("Enter the second String :");
		String str2 = scan.nextLine();
		scan.close();
		String strRem=null;
		//int k=0;
		
		for(int i=0; str1.length()<2;i++) {
			for (int j=0; str2.length()<2;j++) {
				if (str1.charAt(i)==str2.charAt(j))
				{
					continue;
				}
				else
				{
					strRem = str2;
		
				}
			}
			strRem = null;
			strcpy(str2,strRem);
			}
		System.out.println("On removing characters from second string we got:"+strRem);
		
		
	}

	private static void strcpy(String str2, String strRem) {
		// TODO Auto-generated method stub
		str2 = strRem;
	}

}
