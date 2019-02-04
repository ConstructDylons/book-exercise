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
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = bookText;
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
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public boolean isCourseText()
    {
        return courseText;
    }
    
    public void setRefNumber(String ref)
    {
        if(ref.length() >= 3)
        {
            refNumber = ref;
        }
        else
        {
            System.out.printf("Error: Reference Number must be at least 3 characters long\n");
        }
    }
    
    public void borrow()
    {
        borrowed++;
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
    
    public void printRefNumber()
    {
        System.out.printf("Reference Number: ");
        if(refNumber.length() > 0)
        {
            System.out.printf(refNumber);
        }
        else
        {
            System.out.printf("ZZZ");
        }
        System.out.println();
    }
    
    public void printBorrowed()
    {
        System.out.printf("Times Borrowed: " + borrowed);
        System.out.println();
    }
    
    public void printDetails()
    {
        printAuthor();
        printTitle();
        printPages();
        printRefNumber();
        printBorrowed();
    }
}
