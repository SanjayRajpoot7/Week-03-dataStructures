package CircularLinkedList.RoundRobinSchedulingAlgorithm;

public class ProcessNode {
    int processId;
    int burstTime;
    int remainingTime;
    int waitingTime;
    int turnAroundTime;
    int priority;
    ProcessNode next;

    // Constructor to initialize the Process Node
    public ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.waitingTime = 0;
        this.turnAroundTime = 0;
        this.priority = priority;
        this.next = null;
    }
}
