package DoublyLinkedList.UndoRedoFunctionalityEditor;

public class TextEditor {
    private Node head;       // Head of the doubly linked list
    private Node tail;       // Tail of the doubly linked list
    private Node current;    // Current state of the text
    private int size;        // Current size of the history
    private final int MAX_SIZE = 10; // Maximum size of the history

    public TextEditor() {
        head = null;
        tail = null;
        current = null;
        size = 0;
    }

    // Add a new text state to the history
    public void addState(String text) {
        Node newNode = new Node(text);

        if (head == null) {
            // If the list is empty, set the new node as head and tail
            head = newNode;
            tail = newNode;
        } else {
            // Add the new node to the end of the list
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        // Update the current state to the new node
        current = newNode;
        size++;

        // If the history exceeds the maximum size, remove the oldest state
        if (size > MAX_SIZE) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo: Revert to the previous state
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo: " + current.text);
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    // Redo: Revert to the next state
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo: " + current.text);
        } else {
            System.out.println("Nothing to redo.");
        }
    }

    // Display the current state of the text
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current State: " + current.text);
        } else {
            System.out.println("No state available.");
        }
    }
}

