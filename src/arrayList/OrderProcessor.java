package arrayList;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class OrderProcessor {
		
	Scanner scan = new Scanner (System.in);
	
	
	public ArrayList<Book> getOrderFromTheCustomer()
	{
		int bookCount=0;
		ArrayList<Book> bookList = new ArrayList<Book>();
		try {
		System.out.println("Enter the Book count :");
		bookCount = scan.nextInt();
		}
		catch(InputMismatchException ime) 
		{
			System.err.println("Enter Integer Values ");
			System.exit(0);
			}
		try {
		for(int number = 0;number < bookCount;number++)
		{
			bookList.add(getBookDataFromTheCustomer());
		}}catch(InputMismatchException ime) {System.out.println("Input mismatch exception");}
		return bookList;
		
		
	}
	public Book getBookDataFromTheCustomer()
	{
		int id, quantity;
		String name,author,publisher;
		System.out.println("Enter ID, quantity, Name, Author and Publisher :");
		id = scan.nextInt();
		quantity = scan.nextInt();
		name = scan.next();
		author = scan.next();
		publisher = scan.next();
		Book book = new Book(id,quantity,name,author,publisher);
		return book;		
		
	}
	public void printOrderDetails(ArrayList<Book> bookList)
	{
		for(Book details : bookList)
		{
		System.out.print(details.id);
		System.out.print(" " +details.quantity);
		System.out.print(" " +details.name);
		System.out.print(" "+details.author);
		System.out.print(" "+details.publisher);
		System.out.println();
		}
	}

}
