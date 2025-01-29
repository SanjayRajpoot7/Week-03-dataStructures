package DoublyLinkedList.UndoRedoFunctionalityEditor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("\n1. Add Text\n2. Undo\n3. Redo\n4. Display Current State\n5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter text: ");
                    input = scanner.nextLine();
                    editor.addState(input);
                    editor.displayCurrentState();
                    break;
                case 2:
                    editor.undo();
                    editor.displayCurrentState();
                    break;
                case 3:
                    editor.redo();
                    editor.displayCurrentState();
                    break;
                case 4:
                    editor.displayCurrentState();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
