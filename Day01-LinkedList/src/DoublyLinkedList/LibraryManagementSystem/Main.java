package DoublyLinkedList.LibraryManagementSystem;

public class Main {

    public static void main(String[] args) {
        LibraryLinkedList library = new LibraryLinkedList();

        // Adding books
        library.addBookAtBeginning("The Mahabharat", "Ved Vyas", "Devotional", 1, true);
        library.addBookAtEnd("The Ramayan", "Valmiki", "Devotional", 2, true);
        library.addBookAtEnd("1984", "Great Person", "Personality", 3, false);
        library.addBookAtPosition(1, "Realise", "Self Dependent", "Adventure", 4, true);

        // Display books in forward order
        System.out.println("Books in Forward Order:");
        library.displayBooksForward();

        // Display books in reverse order
        System.out.println("\nBooks in Reverse Order:");
        library.displayBooksReverse();

        // Search for a book by Title or Author
        System.out.println("\nSearching for books with 'Harper':");
        library.searchBook("Harper");

        // Update a book's Availability Status
        library.updateAvailabilityStatus(3, true);
        System.out.println("\nUpdated book availability status:");
        library.displayBooksForward();

        // Remove a book by Book ID
        library.removeBookById(2);
        System.out.println("\nBooks after removal:");
        library.displayBooksForward();

        // Count total number of books in the library
        System.out.println("\nTotal number of books in the library: " + library.countBooks());
    }
}
