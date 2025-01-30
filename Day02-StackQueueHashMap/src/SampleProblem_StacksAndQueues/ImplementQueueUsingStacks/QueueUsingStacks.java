package SampleProblem_StacksAndQueues.ImplementQueueUsingStacks;
import java.util.Stack;

public class QueueUsingStacks {

    Stack<Integer> enqueueStack = new Stack<>(); // Stack for enqueue operation
   Stack<Integer> dequeueStack = new Stack<>();
//    Stack<Integer> stack = new Stack<>();// Stack for dequeue operation

    // Constructor to initialize the stacks
//    public QueueUsingStacks() {
//        enqueueStack = new Stack<>();
//        dequeueStack = new Stack<>();
//    }

    // Enqueue operation: Add an element to the queue
    public void enqueue(int x) {
        enqueueStack.push(x); // Simply push the element to the enqueue stack
        System.out.println("Enqueued: " + x);
    }

    // Dequeue operation: Remove and return the front element of the queue
    public int dequeue() {
        if (dequeueStack.isEmpty()) {
            // If the dequeue stack is empty, transfer all elements from the enqueue stack
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        if (dequeueStack.isEmpty()) {
            throw new RuntimeException("Queue is empty"); // Handle underflow
        }
        int front = dequeueStack.pop(); // Pop the front element from the dequeue stack
        System.out.println("Dequeued: " + front);
        return front;
    }

    // Peek operation: Return the front element without removing it
    public int peek(){
        if(dequeueStack.isEmpty()){
            while(!enqueueStack.isEmpty()){
                dequeueStack.push(enqueueStack.pop());
            }
        }

        if(dequeueStack.isEmpty()){
            throw new RuntimeException("Queue is empty");
        }

        return dequeueStack.peek();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }
}
