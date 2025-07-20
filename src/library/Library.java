package library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
        System.out.println("Book added successfully.");
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void searchBook(String keyword) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found for: " + keyword);
        }
    }

    public void borrowBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                if (!book.isBorrowed()) {
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    book.borrow(name);
                    System.out.println("Book borrowed successfully.");
                } else {
                    System.out.println("Book is already borrowed by " + book.getBorrowerName());
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                if (book.isBorrowed()) {
                    book.returnBook();
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("This book was not borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
