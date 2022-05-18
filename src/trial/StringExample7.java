package trial;

import java.util.Scanner;

public class StringExample7 {
	public static void main(String args[])
	{
		String str1,str2;
		char temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string1 :");
		str1 = scan.nextLine();
		System.out.println("Enter the string2 :");
		str2 = scan.nextLine();
		scan.close();
		
		String temp1 = str1;
		String search,replace="";
		
		for (int count1 =0;count1 < str1.length();count1++)
		{
			temp = str1.charAt(count1);
			search = Character.toString(temp);
			
			for (int count2 = 0; count2 < str2.length();count2++)
			{
				if (temp == str2.charAt(count2))
				{
					temp1 = temp1.replace(search,replace);
				}
			}
			
		}
		
		System.out.println("After removing string2 in string1 : "+temp1);
	}

}
