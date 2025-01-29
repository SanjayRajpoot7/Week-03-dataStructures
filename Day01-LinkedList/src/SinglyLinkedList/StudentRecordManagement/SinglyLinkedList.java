package SinglyLinkedList.StudentRecordManagement;

class SinglyLinkedList {
    private StudentNode head; // Pointer to the first student node

    // Constructor to initialize an empty list
    public SinglyLinkedList() {
        this.head = null;
    }

    // Method to check if the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Method to add a student record at the beginning of the list
    public void addAtBeginning(int rollNumber, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        newNode.next = head; // New node points to the current head
        head = newNode;      // Update head to the new node
        System.out.println("Student added at the beginning.");
    }

    // Method to add a student record at the end of the list
    public void addAtEnd(int rollNumber, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        if (isEmpty()) {
            head = newNode; // If the list is empty, the new node becomes the head
        } else {
            StudentNode current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the last node
            }
            current.next = newNode; // Link the new node to the last node
        }
        System.out.println("Student added at the end.");
    }

    public void addAtPosition(int rollNumber, String name, int age, String grade, int position) {
        if (position < 1) {
            System.out.println("Invalid position. Position should be >= 1.");
            return;
        }
        if (position == 1) {
            addAtBeginning(rollNumber, name, age, grade); // Add at the beginning if position is 1
            return;
        }
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        StudentNode current = head;
        for (int i = 1; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Invalid position. Position exceeds the list size.");
                return;
            }
            current = current.next; // Traverse to the node before the desired position
        }
        newNode.next = current.next; // Link the new node to the next node
        current.next = newNode;      // Link the current node to the new node
        System.out.println("Student added at position " + position + ".");
    }

    public void deleteByRollNumber(int rollNumber) {
        if (isEmpty()) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        if (head.rollNumber == rollNumber) {
            head = head.next; // If the head node is to be deleted
            System.out.println("Student with Roll Number " + rollNumber + " deleted.");
            return;
        }
        StudentNode current = head;
        while (current.next != null && current.next.rollNumber != rollNumber) {
            current = current.next; // Traverse to the node before the one to be deleted
        }
        if (current.next == null) {
            System.out.println("Student with Roll Number " + rollNumber + " not found.");
        } else {
            current.next = current.next.next; // Delete the node
            System.out.println("Student with Roll Number " + rollNumber + " deleted.");
        }
    }

    public void searchByRollNumber(int rollNumber) {
        StudentNode current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                System.out.println("Student found: Roll Number = " + current.rollNumber +
                        ", Name = " + current.name +
                        ", Age = " + current.age +
                        ", Grade = " + current.grade);
                return;
            }
            current = current.next;
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }
    public void displayAllStudents() {
        if (isEmpty()) {
            System.out.println("List is empty. No students to display.");
            return;
        }
        StudentNode current = head;
        System.out.println("Student Records:");
        while (current != null) {
            System.out.println("Roll Number: " + current.rollNumber +
                    ", Name: " + current.name +
                    ", Age: " + current.age +
                    ", Grade: " + current.grade);
            current = current.next;
        }
    }

    public void updateGrade(int rollNumber, String newGrade) {
        StudentNode current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                current.grade = newGrade; // Update the grade
                System.out.println("Grade updated for Roll Number " + rollNumber + ".");
                return;
            }
            current = current.next;
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }
}



