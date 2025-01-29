package CircularLinkedList.TaskScheduler;

public class CircularTaskList {
    TaskNode head;

    // Constructor to initialize the circular linked list
    public CircularTaskList() {
        this.head = null;
    }

    // Add a task at the beginning
    public void addTaskAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head; // Circular link
        } else {
            TaskNode current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newTask;
            newTask.next = head;
            head = newTask;
        }
    }

    // Add a task at the end
    public void addTaskAtEnd(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head; // Circular link
        } else {
            TaskNode current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newTask;
            newTask.next = head;
        }
    }

    // Add a task at a specific position
    public void addTaskAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }

        TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);

        if (position == 0) {
            addTaskAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }

        TaskNode current = head;
        int currentPos = 0;
        while (current != null && currentPos < position - 1) {
            current = current.next;
            currentPos++;
        }

        if (current != null) {
            newTask.next = current.next;
            current.next = newTask;
        } else {
            addTaskAtEnd(taskId, taskName, priority, dueDate);
        }
    }

    // Remove a task by Task ID
    public void removeTaskById(int taskId) {
        if (head == null) {
            System.out.println("No tasks to remove.");
            return;
        }

        TaskNode current = head;
        TaskNode prev = null;

        do {
            if (current.taskId == taskId) {
                if (prev == null) {
                    // Removing the head node
                    TaskNode last = head;
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
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Task with ID " + taskId + " not found.");
    }

    // View the current task and move to the next task in the circular list
    public void viewCurrentTask() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        TaskNode current = head;
        System.out.println("Current Task: " + current.taskName + " (ID: " + current.taskId + ")");
        head = current.next;  // Move to the next task
    }

    // Display all tasks starting from the head node
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode current = head;
        do {
            System.out.println("Task ID: " + current.taskId + ", Name: " + current.taskName +
                    ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
            current = current.next;
        } while (current != head);
    }

    // Search for tasks by Priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode current = head;
        boolean found = false;
        do {
            if (current.priority == priority) {
                System.out.println("Found Task: " + current.taskName + " (ID: " + current.taskId + ")");
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No tasks found with priority: " + priority);
        }
    }
}
