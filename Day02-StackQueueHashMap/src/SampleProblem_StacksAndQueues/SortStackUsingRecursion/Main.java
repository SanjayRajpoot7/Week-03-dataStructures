package SampleProblem_StacksAndQueues.SortStackUsingRecursion;

import java.util.Stack;

public class Main extends StackSort {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements into the stack
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Original Stack:");
        printStack(stack);  // Printing original stack

        // Sorting the stack
        sortStack(stack);

        System.out.println("Sorted Stack:");
        printStack(stack);  // Printing sorted stack
    }
}
