package CircularLinkedList.RoundRobinSchedulingAlgorithm;


class RoundRobinScheduler {
    ProcessNode head;
    int timeQuantum;
    int totalProcesses;

    // Constructor to initialize the scheduler
    public RoundRobinScheduler(int timeQuantum) {
        this.head = null;
        this.timeQuantum = timeQuantum;
        this.totalProcesses = 0;
    }

    // Add a new process at the end of the circular list
    public void addProcess(int processId, int burstTime, int priority) {
        ProcessNode newProcess = new ProcessNode(processId, burstTime, priority);
        if (head == null) {
            head = newProcess;
            newProcess.next = head;
        } else {
            ProcessNode current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newProcess;
            newProcess.next = head;
        }
        totalProcesses++;
    }

    // Remove a process by Process ID after its execution
    public void removeProcess(int processId) {
        if (head == null) {
            System.out.println("No processes to remove.");
            return;
        }

        ProcessNode current = head;
        ProcessNode prev = null;

        do {
            if (current.processId == processId) {
                if (prev == null) {
                    // Removing the head node
                    ProcessNode last = head;
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
                totalProcesses--;
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Process with ID " + processId + " not found.");
    }

    // Simulate the scheduling of processes in a round-robin manner with a fixed time quantum
    public void roundRobinScheduling() {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int currentTime = 0;
        ProcessNode current = head;
        while (totalProcesses > 0) {
            if (current.remainingTime > 0) {
                int timeToExecute = Math.min(current.remainingTime, timeQuantum);
                current.remainingTime -= timeToExecute;
                currentTime += timeToExecute;

                // Update waiting time for the remaining processes
                ProcessNode temp = current.next;
                while (temp != current) {
                    temp.waitingTime += timeToExecute;
                    temp = temp.next;
                }

                // If process is complete, calculate turnaround time and remove it
                if (current.remainingTime == 0) {
                    current.turnAroundTime = currentTime;
                    System.out.println("Process ID: " + current.processId + " completed. Turnaround Time: " + current.turnAroundTime);
                    removeProcess(current.processId);
                    current = current.next;
                } else {
                    current = current.next;
                }
            } else {
                current = current.next;
            }

            // Display list after each round
            displayProcesses();
        }
    }

    // Display the list of processes in the circular queue after each round
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        ProcessNode current = head;
        System.out.print("Processes in queue: ");
        do {
            System.out.print("ID: " + current.processId + " (Remaining Time: " + current.remainingTime + ") ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // Calculate and display the average waiting time and turn-around time for all processes
    public void calculateAverageTimes() {
        if (totalProcesses == 0) {
            System.out.println("No processes to calculate.");
            return;
        }

        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        ProcessNode current = head;
        do {
            totalWaitingTime += current.waitingTime;
            totalTurnaroundTime += current.turnAroundTime;
            current = current.next;
        } while (current != head);

        System.out.println("Average Waiting Time: " + (double) totalWaitingTime / totalProcesses);
        System.out.println("Average Turnaround Time: " + (double) totalTurnaroundTime / totalProcesses);
    }
}

