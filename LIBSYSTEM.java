import java.util.Scanner;

public class LIBSYSTEM {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        LIBRARY library = new LIBRARY();
        BORROWTRANSACT borrowtransact = new BORROWTRANSACT();

        System.out.println("----WELCOME TO CMT LIBRARY!----");
        System.out.println();
        System.out.println("----Book Type Choices----");
        System.out.println("1. Non-Fiction");
        System.out.println("2. Fiction");
        System.out.println();

        // Input Type
        System.out.print("Enter Book Type: ");
        String type = scanner.nextLine();
        library.checkchoicestype(type);

        // Input Genre
        System.out.println();
        System.out.print("Enter Book Genre: ");
        String genre = scanner.nextLine();
        library.checkchoicesgenre(genre, type);

        // Input Title
        System.out.println();
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        // Input Borrow Time
        System.out.println();
        System.out.print("Enter Book Borrow Time in Days: ");
        int borrowtime = scanner.nextInt();
        scanner.nextLine(); 

        // Create Book Object
        BOOKS books = new BOOKS(type, genre, title, borrowtime);

        // Process Borrow Transaction
        borrowtransact.borrowBook(books);
    }
}