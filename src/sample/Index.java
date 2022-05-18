package sample;
import java.util.Scanner;
public class Index {
	String input;
	public void getdetails()
	{
		Scanner scan=new Scanner(System.in);
		input=scan.nextLine();
		scan.close();
	}
	public void findIndex()
	{
		int index=input.indexOf("is");
		System.out.println("Index value of:"+index);
	}

	public static void main(String[] args) {
		Index obj=new Index();
		obj.getdetails();
		obj.findIndex();
	}

}
