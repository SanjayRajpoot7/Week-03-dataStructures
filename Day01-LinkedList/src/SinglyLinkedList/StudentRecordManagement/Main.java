package SinglyLinkedList.StudentRecordManagement;


public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Add students
        list.addAtEnd(101, "Shubham", 20, "A");
        list.addAtEnd(102, "Kishore", 21, "B");
        list.addAtBeginning(100, "Ankit", 19, "C");
        list.addAtPosition(103, "Rajesh", 22, "D", 2);

        // Display all students
        list.displayAllStudents();
        System.out.println();

        // Search for a student
        list.searchByRollNumber(102);
        System.out.println();

        // Update a student's grade
        list.updateGrade(101, "A+");
        System.out.println();

        // Delete a student
        list.deleteByRollNumber(100);
        System.out.println();

        // Display all students after updates
        list.displayAllStudents();
    }

}


