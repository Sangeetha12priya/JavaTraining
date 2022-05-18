package sample;
import java.util.Scanner;

public class DifConsMeth {
	int input;
	public void getinput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the input:");
		input=scan.nextInt();
		scan.close();
	}
	DifConsMeth(){}
	DifConsMeth(int input1)
	{
		this.input=input1;
	}
	public void printdetails()
	{
		System.out.println("Input taken in runtime:"+input);
	}

	public static void main(String[] args) {
		DifConsMeth obj=new DifConsMeth();
		obj.getinput();
		obj.printdetails();
		DifConsMeth obj1=new DifConsMeth(80);
		obj1.printdetails();
	}

}
