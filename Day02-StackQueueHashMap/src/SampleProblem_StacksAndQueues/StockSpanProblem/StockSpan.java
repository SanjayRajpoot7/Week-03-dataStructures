package SampleProblem_StacksAndQueues.StockSpanProblem;

import java.util.Stack;

public class StockSpan {
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] spans = new int[n]; // Array to store the spans
        Stack<Integer> stack = new Stack<>(); // Stack to store indices

        for (int i = 0; i < n; i++) {
            // Pop elements from the stack while the current price is greater than the price at the index on top of the stack
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // Calculate the span
            if (stack.isEmpty()) {
                spans[i] = i + 1; // If the stack is empty, the span is the current index + 1
            } else {
                spans[i] = i - stack.peek(); // Otherwise, the span is the difference between the current index and the index on top of the stack
            }

            // Push the current index onto the stack
            stack.push(i);
        }

        return spans;
    }
}
