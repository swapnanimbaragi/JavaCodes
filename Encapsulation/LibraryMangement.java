package Encapsulation;
import java.util.Scanner;
public class LibraryMangement 
{
    private String bookTitle;
    private String author;  
    private String isbn;
    private int publicationYear;
    public String getBookTitle() 
    {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle) 
    {
        this.bookTitle = bookTitle;
    }
    public String getAuthor() 
    {
        return author;
    }
    public void setAuthor(String author) 
    {
        this.author = author;
    }
    public String getIsbn() 
    {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    




    public static void main(String[] args) {    
        LibraryMangement book = new LibraryMangement();
        Scanner scanner = new Scanner(System.in);
        
        String bookTitle=scanner.nextLine();
        String author=scanner.nextLine();
        String isbn=scanner.nextLine();
        int publicationYear=scanner.nextInt();
        
        book.setBookTitle(bookTitle);
        book.setAuthor(author);
        book.setIsbn(isbn);
        book.setPublicationYear(publicationYear);

        System.out.println("Book Title: " + book.getBookTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Publication Year: " + book.getPublicationYear());
        
    }
}
