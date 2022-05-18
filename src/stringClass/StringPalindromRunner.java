package stringClass;
import java.util.Scanner;

public class StringPalindromRunner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input String :");
		String str = scan.next();
		scan.close();
		
		StringPalindrom oStringPalindrom = new StringPalindrom();
		System.out.println("Given String is Palindrom : "+oStringPalindrom.checkPalindrom(str));
		

	}

}
