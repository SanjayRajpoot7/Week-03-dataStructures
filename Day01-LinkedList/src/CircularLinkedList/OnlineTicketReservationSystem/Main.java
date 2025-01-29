package CircularLinkedList.OnlineTicketReservationSystem;

public class Main {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        // Adding tickets
        system.addTicket(101, "Jatin", "Dangale", "A1");
        system.addTicket(102, "Rajeev", "First view", "B2");
        system.addTicket(103, "Shivraj", "The philospher", "C3");

        // Display all tickets
        System.out.println("All Booked Tickets:");
        system.displayTickets();

        // Search for tickets by Customer Name
        System.out.println("\nSearching for tickets by Customer Name 'Alice':");
        system.searchTicket("Alice");

        // Search for tickets by Movie Name
        System.out.println("\nSearching for tickets by Movie Name 'The Batman':");
        system.searchTicket("The Batman");

        // Remove a ticket by Ticket ID
        system.removeTicket(102);

        // Display tickets after removal
        System.out.println("\nAll Booked Tickets after removal:");
        system.displayTickets();

        // Total number of booked tickets
        system.totalBookedTickets();
    }
}
