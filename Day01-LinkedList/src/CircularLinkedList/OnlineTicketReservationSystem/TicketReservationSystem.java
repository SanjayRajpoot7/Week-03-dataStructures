package CircularLinkedList.OnlineTicketReservationSystem;


public class TicketReservationSystem {
    TicketNode head;
    int totalTickets;

    // Constructor to initialize the system
    public TicketReservationSystem() {
        this.head = null;
        this.totalTickets = 0;
    }

    // Add a new ticket reservation at the end of the circular list
    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber) {
        TicketNode newTicket = new TicketNode(ticketId, customerName, movieName, seatNumber);
        if (head == null) {
            head = newTicket;
            newTicket.next = head;  // Circular link
        } else {
            TicketNode current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newTicket;
            newTicket.next = head;  // Circular link
        }
        totalTickets++;
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        TicketNode current = head;
        TicketNode prev = null;

        do {
            if (current.ticketId == ticketId) {
                if (prev == null) {
                    // Removing the head node
                    TicketNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    if (current.next == head) {
                        head = null; // List becomes empty
                    } else {
                        head = current.next;
                    }
                    last.next = head;
                } else {
                    prev.next = current.next;
                }
                totalTickets--;
                System.out.println("Ticket with ID " + ticketId + " removed.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Ticket with ID " + ticketId + " not found.");
    }

    // Display all the current tickets in the list
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets to display.");
            return;
        }

        TicketNode current = head;
        do {
            System.out.println("Ticket ID: " + current.ticketId +
                    ", Customer Name: " + current.customerName +
                    ", Movie Name: " + current.movieName +
                    ", Seat Number: " + current.seatNumber +
                    ", Booking Time: " + current.bookingTime);
            current = current.next;
        } while (current != head);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String searchTerm) {
        if (head == null) {
            System.out.println("No tickets to search.");
            return;
        }

        TicketNode current = head;
        boolean found = false;

        do {
            if (current.customerName.equalsIgnoreCase(searchTerm) || current.movieName.equalsIgnoreCase(searchTerm)) {
                System.out.println("Found Ticket - Ticket ID: " + current.ticketId +
                        ", Customer Name: " + current.customerName +
                        ", Movie Name: " + current.movieName +
                        ", Seat Number: " + current.seatNumber +
                        ", Booking Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No tickets found for search term: " + searchTerm);
        }
    }

    // Calculate the total number of booked tickets
    public void totalBookedTickets() {
        System.out.println("Total number of booked tickets: " + totalTickets);
    }
}

