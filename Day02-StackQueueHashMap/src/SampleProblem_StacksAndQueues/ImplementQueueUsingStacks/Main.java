package SampleProblem_StacksAndQueues.ImplementQueueUsingStacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.enqueue(99);

        System.out.println("Front element: " + queue.peek()); // Should print 10

        queue.dequeue(); // Should remove 10
        queue.dequeue(); // Should remove 20

        queue.enqueue(40);

        System.out.println("Front element: " + queue.peek()); // Should print 30

        queue.dequeue(); // Should remove 30
        queue.dequeue();

        queue.dequeue();
        // Should remove 40

        System.out.println("Is queue empty? " + queue.isEmpty()); // Should print true

//        Stack<Integer> stack = new Stack<>();
    }

}
