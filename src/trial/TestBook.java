package trial;
public class TestBook {
    private String _title;
    private String _author;
    private int _pages;
    private double _price;

public TestBook(String title, String author, int pages, int price){
    this._title = title;
    this._author = author;
    this._pages = pages;
    this._price = price;

}

public static void main(String[] args){

    Book[] books = new Book[6];

    Book book1 = new Book("Java Programming", "Liang", 1320, 149.99);
    Book book2 = new Book("Rainbow Six", "Tom Clancy", 350, 10.99);
    Book book3 = new Book("Tangerine", "Bloor", 180, 8.99);
    Book book4 = new Book("End of Watch", "King", 320, 21.42);
    Book book5 = new Book();
    Book book6 = new Book();


    books[0] = book1;
    books[1] = book2;
    books[2] = book3;
    books[3] = book4;
    books[4] = book5;
    books[5] = book6;

    for (Book u : books)
        System.out.print(u);


}

/*public TestBook(){
    Book[] books = new Book[6];
    Book book5 = new Book("House", "House", 1320, 89);
    Book book6 = new Book("Car", "Car", 1320, 89);



}   

public static double reduceBooks(Book[] books){


    return 0;

}*/

void finishArray(){
Book newbook = new Book();
newbook.setTitle(_title);
newbook.setAuthor(_author);
newbook.setPages(_pages);
newbook.setPrice(_price);

}   
}