public class BORROWTRANSACT {

    //Processing Details
    public void borrowBook(BOOKS books){
        System.out.println("BOOK BORROWED");
        System.out.println();
        System.out.println("Book Type: " + books.gettype());
        System.out.println("Book Genre: " + books.getgenre());
        System.out.println("Book Title: " + books.gettitle());
        System.out.println("Book Borrowed Time: " + books.getborrowtime());
        
    } 
}
