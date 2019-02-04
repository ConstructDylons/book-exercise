/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Dylan Kearney
 * @version 2/4/2019
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
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
    
    public void printAuthor()
    {
        System.out.printf("Author: " + author);
        System.out.println();
    }
    
    public void printTitle()
    {
        System.out.printf("Title: " + title);
        System.out.println();
    }
    
    public void printPages()
    {
        System.out.printf("Pages: " + pages);
        System.out.println();
    }
    
    public void printDetails()
    {
        printAuthor();
        printTitle();
        printPages();
    }
}
