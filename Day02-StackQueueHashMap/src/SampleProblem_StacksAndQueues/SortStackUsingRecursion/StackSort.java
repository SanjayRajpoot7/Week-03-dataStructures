package SampleProblem_StacksAndQueues.SortStackUsingRecursion;
import java.util.Stack;

public class StackSort {

        // Main function to sort the stack
        public static void sortStack(Stack<Integer> stack) {
            if (!stack.isEmpty()) {
                // Pop the top element
                int top = stack.pop();

                // Recursively sort the remaining stack
                sortStack(stack);

                // Insert the popped element back in the sorted stack
                insertSorted(stack, top);
            }
        }

        // Helper function to insert an element in the sorted stack
         public static void insertSorted(Stack<Integer> stack, int element) {
            // Base case: If the stack is empty or the element is greater than the top element
            if (stack.isEmpty() || element >= stack.peek()) {
                stack.push(element);
            } else {
                // Pop the top element and recursively insert the element
                int top = stack.pop();
                insertSorted(stack, element);

                // Push the popped element back after inserting the new element
                stack.push(top);
            }
        }

        // Utility function to print the stack
        public static void printStack(Stack<Integer> stack) {
            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
            System.out.println();
        }

}
