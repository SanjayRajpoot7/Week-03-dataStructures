package DoublyLinkedList.LibraryManagementSystem;

public class BookNode {
String title;
String author;
String genre;
int bookId;
boolean isAvailable;
BookNode next;
BookNode prev;

// Constructor to initialize a Book Node
public BookNode(String title, String author, String genre, int bookId, boolean isAvailable) {
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.bookId = bookId;
    this.isAvailable = isAvailable;
    this.next = null;
    this.prev = null;
}
}
