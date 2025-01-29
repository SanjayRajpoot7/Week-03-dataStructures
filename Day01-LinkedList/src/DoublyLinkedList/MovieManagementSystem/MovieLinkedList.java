package DoublyLinkedList.MovieManagementSystem;

public class MovieLinkedList {
    private MovieNode head;
    private MovieNode tail;

    public MovieLinkedList() {
        head = null;
        tail = null;
    }

    // Add a movie at the beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newMovie = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
        System.out.println("Movie added at the beginning: " + title);
    }

    // Add a movie at the end
    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newMovie = new MovieNode(title, director, year, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            newMovie.prev = tail;
            tail.next = newMovie;
            tail = newMovie;
        }
        System.out.println("Movie added at the end: " + title);
    }

    // Add a movie at a specific position
    public void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }
        if (position == 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        MovieNode newMovie = new MovieNode(title, director, year, rating);
        MovieNode current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of range.");
            return;
        }
        newMovie.next = current.next;
        if (current.next != null) {
            current.next.prev = newMovie;
        } else {
            tail = newMovie;
        }
        current.next = newMovie;
        newMovie.prev = current;
        System.out.println("Movie added at position " + position + ": " + title);
    }

    // Remove a movie by title
    public void removeByTitle(String title) {
        MovieNode current = head;
        while (current != null) {
            if (current.title.equals(title)) {
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
                System.out.println("Movie removed: " + title);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found: " + title);
    }

    // Search for movies by director
    public void searchByDirector(String director) {
        MovieNode current = head;
        boolean found = false;
        while (current != null) {
            if (current.director.equals(director)) {
                System.out.println("Found: " + current.title + " by " + current.director);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("No movies found by director: " + director);
        }
    }

    // Search for movies by rating
    public void searchByRating(double rating) {
        MovieNode current = head;
        boolean found = false;
        while (current != null) {
            if (current.rating == rating) {
                System.out.println("Found: " + current.title + " with rating " + current.rating);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("No movies found with rating: " + rating);
        }
    }

    // Display all movies in forward order
    public void displayForward() {
        MovieNode current = head;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Director: " + current.director + ", Year: " + current.year + ", Rating: " + current.rating);
            current = current.next;
        }
    }

    // Display all movies in reverse order
    public void displayReverse() {
        MovieNode current = tail;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Director: " + current.director + ", Year: " + current.year + ", Rating: " + current.rating);
            current = current.prev;
        }
    }

    // Update a movie's rating by title
    public void updateRating(String title, double newRating) {
        MovieNode current = head;
        while (current != null) {
            if (current.title.equals(title)) {
                current.rating = newRating;
                System.out.println("Updated rating for " + title + " to " + newRating);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found: " + title);
    }
}
