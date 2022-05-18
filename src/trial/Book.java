package trial;
public class Book {

    private String _title;
    private String _author;
    private int _pages;
    private double _price;
    public int numBooks = 0;
    public  Book(){
        for (int i = 0; i > 6; i++)
            numBooks++;

    }

    public Book(String title, String author, int pages, double price)
    {   super();
        this._title = title;
        this._author = author;
        this._pages = pages;
        this._price = price;
    }

    public String getTitle()

    {
        return _title;
    }

    public void setTitle(String title)

    {
        this._title = title;
    }

    public String getAuthor()

    {
        return _author;
    }

    public void setAuthor(String author)

    {
        this._author = author;
    }

    public int getPages()

    {
        return _pages;
    }

    public void setPages(int pages)

    {
        this._pages = pages;
    }

    public double getPrice()

    {
        return _price;
    }

    public void setPrice(double price)

    {
        this._price = price;

    }

    public String toString()
    {
        return "Book [Title: " + _title + ", Author: " + _author + ", Pages: " + _pages + ", Price: $" + _price +"]\n";
    }
}