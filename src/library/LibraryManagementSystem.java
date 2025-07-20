package library;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Show All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author name: ");
                    String author = sc.nextLine();
                    library.addBook(title, author);
                    break;
                case 2:
                    library.showAllBooks();
                    break;
                case 3:
                    System.out.print("Enter title/author keyword to search: ");
                    String keyword = sc.nextLine();
                    library.searchBook(keyword);
                    break;
                case 4:
                    System.out.print("Enter book ID to borrow: ");
                    int borrowId = sc.nextInt();
                    sc.nextLine();
                    library.borrowBook(borrowId);
                    break;
                case 5:
                    System.out.print("Enter book ID to return: ");
                    int returnId = sc.nextInt();
                    sc.nextLine();
                    library.returnBook(returnId);
                    break;
                case 6:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
