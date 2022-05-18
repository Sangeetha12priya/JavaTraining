package stringClass;
import java.util.Scanner;

public class RemovalOfCharactersRunnerClass {
	
	public static void main(String[] args) {
		String str1,str2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String1 :");
		str1 = scan.nextLine();
		System.out.print("Enter the String2 :");
		str2 = scan.nextLine();
		scan.close();	
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		RemovalOfCharacters oRemovalOfCharacters = new RemovalOfCharacters();
		oRemovalOfCharacters.removeCharacters(str1, str2);
		
	
	}

}
