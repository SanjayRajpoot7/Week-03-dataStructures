package DoublyLinkedList.UndoRedoFunctionalityEditor;

public class Node {
    String text; // Represents the text state
    Node prev;   // Pointer to the previous state
    Node next;   // Pointer to the next state

    public Node(String text) {
        this.text = text;
        this.prev = null;
        this.next = null;
    }
}

