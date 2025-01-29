package CircularLinkedList.RoundRobinSchedulingAlgorithm;

public class Main {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(4);  // Time Quantum = 4 units

        // Adding processes to the scheduler
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 3);
        scheduler.addProcess(4, 6, 4);

        // Start round-robin scheduling
        scheduler.roundRobinScheduling();

        // Calculate and display average waiting and turnaround times
        scheduler.calculateAverageTimes();
    }
}
