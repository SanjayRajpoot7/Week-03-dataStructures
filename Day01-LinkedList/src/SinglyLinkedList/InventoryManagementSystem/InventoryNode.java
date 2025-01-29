package SinglyLinkedList.InventoryManagementSystem;

public class InventoryNode {
    String itemName;
    int itemId;
    int quantity;
    int price;
    InventoryNode next;

    InventoryNode(String itemName, int itemId,
              int quantity, int price){
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }

}
