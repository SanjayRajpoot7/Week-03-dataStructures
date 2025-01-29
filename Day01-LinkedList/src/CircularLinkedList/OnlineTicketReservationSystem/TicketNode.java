package CircularLinkedList.OnlineTicketReservationSystem;

import java.text.SimpleDateFormat;
import java.util.Date;

class TicketNode {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    TicketNode next;

    // Constructor to initialize a Ticket Node
    public TicketNode(int ticketId, String customerName, String movieName, String seatNumber) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = getCurrentTime(); // Record the booking time when the ticket is created
        this.next = null;
    }

    // Method to get the current time in "yyyy-MM-dd HH:mm:ss" format
    private String getCurrentTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return formatter.format(date);
    }
}