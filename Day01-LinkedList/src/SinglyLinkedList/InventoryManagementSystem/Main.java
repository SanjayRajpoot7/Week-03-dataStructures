package SinglyLinkedList.InventoryManagementSystem;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList inventoryNode = new SinglyLinkedList();

        inventoryNode.addAtBeginning("Keyboard", 107, 5, 8900);
        inventoryNode.addAtEnding("Laptop", 101, 10, 76000);
        inventoryNode.addAtEnding("Mouse", 102, 50, 220);
        inventoryNode.addAtBeginning("Keyboard", 103, 30, 450);
        System.out.println();
        inventoryNode.addAtPosition("Monitor", 104, 15, 3500, 2);

        System.out.println();
        inventoryNode.displayItems();
        System.out.println();

        inventoryNode.searchByItemId(102);
        inventoryNode.searchByItemName("Monitor");

        inventoryNode.updateQuantity(101, 5);
        inventoryNode.removeByItemId(103);

        inventoryNode.displayItems();
        System.out.println();

        inventoryNode.calculateTotalValue();

        inventoryNode.sortByItemName();
        inventoryNode.displayItems();
        System.out.println();


        System.out.println("\nSorting by Price (ascending): ");
        inventoryNode.sortByPrice(true);
        inventoryNode.displayItems();

        System.out.println("\nSorting by Price (descending): ");
        inventoryNode.sortByPrice(false);
        inventoryNode.displayItems();
    }
    }
