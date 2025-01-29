package DoublyLinkedList.LibraryManagementSystem;

class LibraryLinkedList {
    BookNode head;
    BookNode tail;
    int totalBooks;

    // Constructor to initialize the linked list
    public LibraryLinkedList() {
        this.head = null;
        this.tail = null;
        this.totalBooks = 0;
    }

    // Add a new book at the beginning
    public void addBookAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
        BookNode newBook = new BookNode(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = newBook;
            tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        totalBooks++;
    }

    // Add a new book at the end
    public void addBookAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
        BookNode newBook = new BookNode(title, author, genre, bookId, isAvailable);
        if (tail == null) {
            head = newBook;
            tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        totalBooks++;
    }

    // Add a new book at a specific position
    public void addBookAtPosition(int position, String title, String author, String genre, int bookId, boolean isAvailable) {
        if (position < 0 || position > totalBooks) {
            System.out.println("Invalid position.");
            return;
        }
        BookNode newBook = new BookNode(title, author, genre, bookId, isAvailable);
        if (position == 0) {
            addBookAtBeginning(title, author, genre, bookId, isAvailable);
            return;
        }
        BookNode current = head;
        int currentPos = 0;
        while (current != null && currentPos < position - 1) {
            current = current.next;
            currentPos++;
        }
        if (current != null) {
            newBook.next = current.next;
            newBook.prev = current;
            if (current.next != null) {
                current.next.prev = newBook;
            } else {
                tail = newBook;
            }
            current.next = newBook;
        }
        totalBooks++;
    }

    // Remove a book by Book ID
    public void removeBookById(int bookId) {
        BookNode current = head;
        while (current != null) {
            if (current.bookId == bookId) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                totalBooks--;
                return;
            }
            current = current.next;
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    // Search for a book by Title or Author
    public void searchBook(String searchTerm) {
        BookNode current = head;
        boolean found = false;
        while (current != null) {
            if (current.title.contains(searchTerm) || current.author.contains(searchTerm)) {
                System.out.println("Found book: " + current.title + ", Author: " + current.author +
                        ", Genre: " + current.genre + ", Book ID: " + current.bookId +
                        ", Availability: " + (current.isAvailable ? "Available" : "Not Available"));
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("No books found with the term: " + searchTerm);
        }
    }

    // Update a book's Availability Status by Book ID
    public void updateAvailabilityStatus(int bookId, boolean newStatus) {
        BookNode current = head;
        while (current != null) {
            if (current.bookId == bookId) {
                current.isAvailable = newStatus;
                return;
            }
            current = current.next;
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    // Display all books in forward order
    public void displayBooksForward() {
        BookNode current = head;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Author: " + current.author +
                    ", Genre: " + current.genre + ", Book ID: " + current.bookId +
                    ", Availability: " + (current.isAvailable ? "Available" : "Not Available"));
            current = current.next;
        }
    }

    // Display all books in reverse order
    public void displayBooksReverse() {
        BookNode current = tail;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Author: " + current.author +
                    ", Genre: " + current.genre + ", Book ID: " + current.bookId +
                    ", Availability: " + (current.isAvailable ? "Available" : "Not Available"));
            current = current.prev;
        }
    }

    // Count the total number of books in the library
    public int countBooks() {
        return totalBooks;
    }
}

