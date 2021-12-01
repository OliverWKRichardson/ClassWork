/**
* A class that maintains information on a book.
* This might form part of a larger application such
* as a library system, for instance.
*
* @author Oliver Richardson
* @version 18/10/21
*/
public class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    /**
    * Set the author and title fields when this object
    * is constructed.
    */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
     author = bookAuthor;
     title = bookTitle;
     pages = bookPages;
     refNumber = "";
     borrowed = 0;
    }

    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public void printDetail()
    {
         System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Times Borrowed: " + borrowed);
    }
    
    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public void borrow()
    {
        borrowed = borrowed++;
    }
}