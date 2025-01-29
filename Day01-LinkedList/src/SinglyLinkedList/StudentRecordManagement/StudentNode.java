package SinglyLinkedList.StudentRecordManagement;

// Node class to represent a student record
class StudentNode {
    int rollNumber;
    String name;
    int age;
    String grade;
    StudentNode next;

    // Constructor to create a new student node
    public StudentNode(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}