package DoublyLinkedList.MovieManagementSystem;

public class Main {
    public static void main(String[] args) {
        MovieLinkedList manager = new MovieLinkedList();

        // Adding movies
        manager.addAtBeginning("Bahubali", "S.S Rajamouli", 2015, 8.8);
        manager.addAtEnd("Dangal", "Nitish Tiwari", 2012, 9.0);
        manager.addAtPosition(2, "Avengers", "ABC", 2015, 8.6);

        // Displaying movies
        System.out.println();
        System.out.println("Movies in forward order:");
        manager.displayForward();
        System.out.println();
        System.out.println("Movies in reverse order:");
        manager.displayReverse();

        // Searching movies
        manager.searchByDirector("Christopher Nolan");
        manager.searchByRating(8.8);

        // Updating a movie's rating
        manager.updateRating("Inception", 9.0);

        // Removing a movie
        manager.removeByTitle("Interstellar");

        // Displaying movies after removal
        System.out.println();
        System.out.println("Movies in forward order after removal:");
        manager.displayForward();
    }
}
