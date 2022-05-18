package sample;
import java.util.Scanner;
public class CountCharacter {
	String name;
	int count=0;
	CountCharacter()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name");
		name=scan.nextLine();
		scan.close();
	}
	public void countName()
	{
		/*for(int i=0;i<name.length();i++)
		{
			count++;
		}*/
		System.out.println("Number of characters in name is "+name.length());
	}

	public static void main(String[] args) {
		CountCharacter count=new CountCharacter();
		count.countName();
	}

}
