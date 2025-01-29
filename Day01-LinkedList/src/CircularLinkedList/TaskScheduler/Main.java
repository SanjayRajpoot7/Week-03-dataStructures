package CircularLinkedList.TaskScheduler;

public class Main {
        public static void main(String[] args) {
            CircularTaskList taskList = new CircularTaskList();

            // Adding tasks
            taskList.addTaskAtBeginning(1, "Leetcode problem", 2, "2025-01-30");
            taskList.addTaskAtEnd(2, "Prepare presentation", 1, "2025-01-28");
            taskList.addTaskAtEnd(3, "Writing notes", 3, "2025-01-29");
            taskList.addTaskAtPosition(1, 4, "Reading book", 2, "2025-02-01");

            // Display all tasks
            System.out.println("All Tasks:");
            taskList.displayTasks();

            // View the current task and move to the next task
            taskList.viewCurrentTask();

            // Search for tasks by priority
            System.out.println("\nSearch tasks with priority 2:");
            taskList.searchByPriority(2);

            // Remove a task by Task ID
            System.out.println("\nRemoving task with ID 2:");
            taskList.removeTaskById(2);

            // Display tasks after removal
            System.out.println("\nAll Tasks after removal:");
            taskList.displayTasks();

            // View the current task again
            taskList.viewCurrentTask();
        }

}
