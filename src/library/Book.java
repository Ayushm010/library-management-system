package library;

public class Book {
    private static int idCounter = 1; 
    private int id;
    private String title;
    private String author;
    private boolean isBorrowed;
    private String borrowerName;

    public Book(String title, String author) {
        this.id = idCounter++;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
        this.borrowerName = null;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void borrow(String name) {
        isBorrowed = true;
        borrowerName = name;
    }

    public void returnBook() {
        isBorrowed = false;
        borrowerName = null;
    }

    public String toString() {
        return "[" + id + "] \"" + title + "\" by " + author + 
               (isBorrowed ? " [Borrowed by: " + borrowerName + "]" : " [Available]");
    }
}
